/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Distribuidora {
    String nomed;

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    String cnpj;
    String locate;
    String cep;
    String loguin;
    String senha;
    public void Distri(String nomed, String cnpj, String locate, String cep ) {
        this.nomed = nomed;
        this.cnpj = cnpj;
        this.locate = locate;
        this.cep = cep;
    }

    public Distribuidora(String loguin, String senha) {
        this.loguin = loguin;
        this.senha = senha;
    }

    public String getNomed() {
        return nomed;
    }

    public void setNomed(String nomed) {
        this.nomed = nomed;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    void stausscanner(){
        
    }
    Scanner teclado = new Scanner(System.in);
     void statusname (){
         
         //System.out.println("O nome da distribuidora cadastrada é");
     //System.out.println(getNomed());     
    }
    
     void statuscnpj (){
          // System.out.println("O CNPJ cadastrado é");
     //System.out.println(getCnpj()); 
     }
     
     void statuscep(){
       //  System.out.println("O CEP cadastrado é");
         //System.out.println(getCep());
     }
     
     void statuslocate(){
         //System.out.println("O Endereço cadastrado é");
         //System.out.println(getLocate());
     }
     
}
