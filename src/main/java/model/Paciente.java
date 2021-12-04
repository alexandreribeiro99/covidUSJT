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
public class Paciente {

    private String nome;
    private String idade;
    private String endereco;
    private boolean funcSaude;
    private String dataVac;

    public Paciente(String nome, String idade, String endereco, boolean funcSaude) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.funcSaude = funcSaude;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isFunSaude() {
        return funcSaude;
    }

    public void setFunSaude(boolean funSaude) {
        this.funcSaude = funSaude;
    }

    public String getDataVac() {
        return dataVac;
    }

    public void setDataVac(String dataVac) {
        this.dataVac = dataVac;
    }
}
