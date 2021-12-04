
package controller;

import model.Paciente;
import model.Administrador;
import model.Usuario;
import model.Atendente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
       
        String sql = "SELECT * FROM tb_atendente WHERE nome=? AND senha=?";
        
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
    
        public boolean existeAdmin(Usuario usuario) throws Exception {
        
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
    
    
    public void inserirAdmin(Administrador adm) throws Exception {
        
        // 1º passo: definir a SQL:
        String sql = "INSERT INTO tb_administrador (nome, senha, idade, endereco, cpf) VALUES (?, ?, ?, ?, ?) ";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();
        
        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 4º passo: preencher os dados do SQL:
        pst.setString(1, adm.getNome());
        pst.setString(2, adm.getSenha());
        pst.setString(3, adm.getIdade());
        pst.setString(4, adm.getEndereco());
        pst.setString(5, adm.getCPF());
        
        // 5º passo: executar:
        pst.execute();
    }
    
    
        
    public void inserirAtendente(Atendente aten) throws Exception {
        
        // 1º passo: definir a SQL:
        String sql = "INSERT INTO tb_atendente (nome, senha, idade, endereco, cpf) VALUES (?, ?, ?, ?, ?) ";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();
        
        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 4º passo: preencher os dados do SQL:
        pst.setString(1, aten.getNome());
        pst.setString(2, aten.getSenha());
        pst.setString(3, aten.getIdade());
        pst.setString(4, aten.getEndereco());
        pst.setString(5, aten.getCPF());
        
        // 5º passo: executar:
        pst.execute();
    }
    
        public void inserirPaciente (Paciente pac) throws Exception {
        
        // 1º passo: definir a SQL:
        String sql = "INSERT INTO tb_paciente (nome, idade, endereco, funSaude, dataVac) VALUES (?, ?, ?, ?, ?) ";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();
        
        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);
        
        // 4º passo: preencher os dados do SQL:
        pst.setString(1, pac.getNome());
        pst.setString(2, pac.getIdade());
        pst.setString(3, pac.getEndereco());
        pst.setBoolean(4, pac.isFunSaude());
        pst.setString(5, pac.getDataVac());
        
        // 5º passo: executar:
        pst.execute();
    }
    
}

        // 1º passo: definir a SQL:
        // 2º passo: obter uma conexão com o banco de dados:
        // 3º passo: compilar o comando SQL:
        // 4º passo: preencher os dados do SQL:
        // 5º passo: executar e verificar o resultado: