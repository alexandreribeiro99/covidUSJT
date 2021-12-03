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
public class Atendente extends Usuario
{
    private String CPF;

    public Atendente(String CPF, String nome, String senha) {
        super(nome, senha);
        this.CPF = CPF;
    }

    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
}
