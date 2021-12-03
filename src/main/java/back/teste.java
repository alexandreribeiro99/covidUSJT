/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

/**
 *
 * @author vasqu
 */
public class teste 
{
    public static void main(String[] args) 
    {
        Administrador admin = new Administrador();
        
        admin.setNome("Robson");
        admin.setIdade(26);
        admin.setEndereco("Rua 10, n 56");
        admin.setCPF("457888643678");

        System.out.println(admin.getNome());
    }
}
