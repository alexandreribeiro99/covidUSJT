/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vasqu
 */
public class Atendente{

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    private String CPF;
    private String idade;
    private String nome;
    private String endereco;
    private String senha;

    public Atendente(String nome, String senha, String idade, String endereco, String cpf) {
        this.CPF = cpf;
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
    }
    
}
