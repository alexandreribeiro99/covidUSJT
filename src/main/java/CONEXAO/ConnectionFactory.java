/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author vasqu
 */
public class ConnectionFactory 
{
    private static String usuario = "root";
    private static String senha = "12345";
    private static String host = "localhost";
    private static String porta = "3306";
    private static String bd = "filafacil";
    
    public static Connection obtemConexao()
    {
        try
        {
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC",
                usuario,
                senha
            );
            return c;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
