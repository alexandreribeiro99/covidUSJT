/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author vasqu
 */
public class Administrador extends Usuario
{
    String CPF;
    int idade;
    String nome;
    String endereco;
    String senha;

    public Administrador(String CPF, int idade, String nome, String endereco, String senha) {
        super(nome, senha);
        this.CPF = CPF;
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
    }

    

    
    
    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}
