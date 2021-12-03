
package CONEXAO;

import Entidades.*;
import CONEXAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Classe responsável por executar ações relacionadas
 * ao banco de dados.
 * 
 */
public class DAO {
    
    /**
     * Verifica se um usuário existe ou não no banco de dados
     * @param usuario o usuário a ser procurado
     * @return verdadeiro se existe, falso caso contrário
     * @throws Exception se der ruim
     */
    public boolean existe(Usuario usuario) throws Exception {
        
        // 1º passo: definir a SQL:
        String sql = "SELECT * FROM tb_administrador WHERE nome=? AND senha=?";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();
        
        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 4º passo: preencher os dados do SQL:
        pst.setString(1, usuario.getNome());
        pst.setString(2, usuario.getSenha());
        
        // 5º passo: executar e verificar o resultado:
        ResultSet resultado = pst.executeQuery();
        
        // Retornar se existe algum registro ou não:
        return resultado.next();
    }
    
   /*public ArrayList<Curso> obterCursos() throws Exception {
    
        // 1º passo: definir a SQL:
        String sql = "SELECT * FROM tb_curso";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();
        
        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 4º passo: executar e verificar o resultado:
        ResultSet resultado = pst.executeQuery();
        
        // Criar uma lista para guardar todos os objetos:
        ArrayList<Curso> lista = new ArrayList<Curso>();
        
        // Laço de repetição para percorrer todos os registros que retornaram do banco:
        while (resultado.next()) {
            
            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            String tipo = resultado.getString("tipo");
            
            Curso c = new Curso(id, nome, tipo);
            
            lista.add(c);
        }
        
        return lista;
    }*/
    
    
    public void inserirCurso(Administrador administrador) throws Exception {
        
        // 1º passo: definir a SQL:
        String sql = "INSERT INTO tb_administrador (nome, senha, idade, endereco, cpf) VALUES (?, ?, ?, ?, ?) ";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();
        
        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 4º passo: preencher os dados do SQL:
        pst.setString(1, administrador.getNome());
        pst.setString(2, administrador.getSenha());
        pst.setInt(2, administrador.getIdade());
        pst.setString(2, administrador.getEndereco());
        pst.setString(2, administrador.getCPF());
        
        // 5º passo: executar:
        pst.execute();
    }
    
}

        // 1º passo: definir a SQL:
        // 2º passo: obter uma conexão com o banco de dados:
        // 3º passo: compilar o comando SQL:
        // 4º passo: preencher os dados do SQL:
        // 5º passo: executar e verificar o resultado:
