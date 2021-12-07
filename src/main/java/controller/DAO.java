
package controller;

import model.Paciente;
import model.Administrador;
import model.Usuario;
import model.Atendente;
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
            int id;
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
        
        public ArrayList<Paciente> obterPacientes() throws Exception{
             // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_paciente WHERE dataVac IS NULL  ORDER BY idade desc, funSaude = 1;";
            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            
            
            ResultSet resultado = pst.executeQuery();
            ArrayList<Paciente> lista = new ArrayList<Paciente>();
            while (resultado.next()){
            int id = resultado.getInt(1);
            String nome = resultado.getString("nome");
            String idade = resultado.getString("idade");
            String endereco = resultado.getString("endereco");
            boolean funcSaude = resultado.getBoolean("funSaude");
            

                Paciente p = new Paciente(id,nome,idade,endereco,funcSaude);
                
                lista.add(p);
            }
                        
            
            return lista;

        }
        
        
       public int vacinar(int id) throws Exception {

        // 1º passo: definir a SQL:
        String sql = "UPDATE tb_paciente SET dataVac = CURRENT_TIMESTAMP() where id = ?;";
        
        // 2º passo: obter uma conexão com o banco de dados:
        Connection conn = ConnectionFactory.obtemConexao();

        // 3º passo: compilar o comando SQL:
        PreparedStatement pst = conn.prepareStatement(sql);

        // 4º passo: preencher os dados do SQL:
        pst.setInt(1,id);
    
      // 5º passo: executar:
        pst.execute();
        
        return 0;
       
    }
       
      
}

