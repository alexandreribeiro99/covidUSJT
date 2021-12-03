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
public class Paciente extends Usuario
{
    private boolean funSaude;

    public Paciente(boolean funSaude, String dataVac, String nome, String senha) {
        super(nome, senha);
        this.funSaude = funSaude;
        this.dataVac = dataVac;
    }
    private String dataVac;

    
    
    public boolean isFunSaude() {
        return funSaude;
    }

    public void setFunSaude(boolean funSaude) {
        this.funSaude = funSaude;
    }

    public String getDataVac() {
        return dataVac;
    }

    public void setDataVac(String dataVac) {
        this.dataVac = dataVac;
    }
}
