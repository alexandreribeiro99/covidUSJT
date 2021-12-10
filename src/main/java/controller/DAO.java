
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
            String sql = "SELECT * FROM tb_paciente WHERE dataVac IS NULL ORDER BY idade desc, funSaude = 1;";
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
        
           public ArrayList<Paciente> obterPacientesRemover() throws Exception{
             // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_paciente;";
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
           
            public ArrayList<Atendente> obterAtendentesRemover() throws Exception{
             // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_atendente;";
            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            
            
            ResultSet resultado = pst.executeQuery();
            ArrayList<Atendente> lista = new ArrayList<Atendente>();
            while (resultado.next()){
            int id = resultado.getInt(1);
            String cpf = resultado.getString("CPF");
            String nome = resultado.getString("nome");
            String idade = resultado.getString("idade");
            String endereco = resultado.getString("endereco");
            String senha = resultado.getString("senha");
            

                Atendente a = new Atendente(id,nome,senha,idade,endereco,cpf);
                
                lista.add(a);
            }
                        
            
            return lista;

        }
           
           public ArrayList<Administrador> obterAdmRemover() throws Exception{
             // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_administrador;";
            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            
            
            ResultSet resultado = pst.executeQuery();
            ArrayList<Administrador> lista = new ArrayList<Administrador>();
            while (resultado.next()){
            int id = resultado.getInt(1);
            String cpf = resultado.getString("CPF");
            String nome = resultado.getString("nome");
            String idade = resultado.getString("idade");
            String endereco = resultado.getString("endereco");
            String senha = resultado.getString("senha");
            

                Administrador ad = new Administrador(id,nome,senha,idade,endereco,cpf);
                
                lista.add(ad);
            }
                        
            
            return lista;

        }
        
        
        
       public int vacinar(int id) throws Exception {

        // 1º passo: definir a SQL:
        String sql = "UPDATE tb_paciente SET dataVac = CURRENT_DATE() where id = ?";
        
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
       
       
        public static double relatorio1(String DataInicio, String DataFim) throws Exception {

            // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_paciente WHERE idade > '90' AND dataVac >= ? AND dataVac <= ?;";
  

            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, DataInicio);
            pst.setString(2, DataFim);
            ResultSet resultado = pst.executeQuery();

             
            
            String nome = "nd";
            int contPacientes = 0;
            while (resultado.next()){
            
                nome = resultado.getString("nome");
                contPacientes++;
            
            }
           
            return contPacientes;
       
    }
        
        
        public static double relatorio2(String DataInicio, String DataFim) throws Exception {

            // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_paciente WHERE idade >= 70 AND idade < 90 AND dataVac >= ? AND dataVac <= ?;";
  

            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, DataInicio);
            pst.setString(2, DataFim);

            ResultSet resultado = pst.executeQuery();

             
            
            String nome = "nd";
            int contPacientes = 0;
            while (resultado.next()){
            
                nome = resultado.getString("nome");
                contPacientes++;
            
            }
            
            return contPacientes;
       
    }
        
         public static double relatorio3(String DataInicio, String DataFim) throws Exception {

            // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_paciente WHERE idade >= 50 AND idade < 70 AND dataVac >= ? AND dataVac <= ?;";
  

            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, DataInicio);
            pst.setString(2, DataFim);

            ResultSet resultado = pst.executeQuery();

             
            
            String nome = "nd";
            int contPacientes = 0;
            while (resultado.next()){
            
                nome = resultado.getString("nome");
                contPacientes++;
            
            }

            return contPacientes;
       
    }
         
         
         
         public static double relatorio4(String DataInicio, String DataFim) throws Exception {

            // 1º passo: definir a SQL:
            String sql = "SELECT * FROM tb_paciente WHERE idade < 50 AND dataVac >= ? AND dataVac <= ?;";
  

            // 2º passo: obter uma conexão com o banco de dados:
            Connection conn = ConnectionFactory.obtemConexao();
            // 3º passo: compilar o comando SQL:
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, DataInicio);
            pst.setString(2, DataFim);

            ResultSet resultado = pst.executeQuery();

             
            
            String nome = "nd";
            int contPacientes = 0;
            while (resultado.next()){
            
                nome = resultado.getString("nome");
                contPacientes++;
            
            }
       
            return contPacientes;
       
    }
        
        
        
        
        
        public int removerPaciente(int id) throws Exception {

        // 1º passo: definir a SQL:
        String sql = "DELETE FROM tb_paciente WHERE id = ?;";
        
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
        
        public int removerAtendente(int id) throws Exception {

        // 1º passo: definir a SQL:
        String sql = "DELETE FROM tb_atendente WHERE id = ?;";
        
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
        
        public int removerAdm(int id) throws Exception {

        // 1º passo: definir a SQL:
        String sql = "DELETE FROM tb_administrador WHERE id = ?;";
        
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

      



