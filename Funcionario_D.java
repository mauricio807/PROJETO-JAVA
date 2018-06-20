/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

/**
 *
 * @author mauri
 */
public class Funcionario_D {
    String nomef;
    String cpfuncio;
    String datanascf;
    float salariof;
    String enderecof;

    public Funcionario_D(String nomef, String cpfuncio, String datanascf, float salariof, String enderecof) {
        this.nomef = nomef;
        this.cpfuncio = cpfuncio;
        this.datanascf = datanascf;
        this.salariof = salariof;
        this.enderecof = enderecof;
    }

    public String getNomef() {
        return nomef;
    }

    public void setNomef(String nomef) {
        this.nomef = nomef;
    }

    public String getCpfuncio() {
        return cpfuncio;
    }

    public void setCpfuncio(String cpfuncio) {
        this.cpfuncio = cpfuncio;
    }

    public String getDatanascf() {
        return datanascf;
    }

    public void setDatanascf(String datanascf) {
        this.datanascf = datanascf;
    }

    public float getSalariof() {
        return salariof;
    }

    public void setSalariof(float salariof) {
        this.salariof = salariof;
    }

    public String getEnderecof() {
        return enderecof;
    }

    public void setEnderecof(String enderecof) {
        this.enderecof = enderecof;
    }
    
    
}
