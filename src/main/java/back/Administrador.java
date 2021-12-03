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
public class Administrador extends Usuario
{
    private String CPF;

    public Administrador(String CPF, String nome, String senha) {
        super(nome, senha);
        this.CPF = CPF;
        this.endereco = endereco;
        this.nome = nome;
        this.senha = senha;
    }

    
    
    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}
