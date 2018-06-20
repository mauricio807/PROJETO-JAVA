
package projeto;

import java.util.Scanner;

public class CadastrarProduto {
        private String codigo;
        private String nome;
        private String tipo;
        private float valor;
        private int quant;
        
    public void CadastrarProduto( String _codigo, String _nome, String  _tipo, float _valor, int _quant  ) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.tipo = _tipo;
        this.valor = _valor;
        this.quant = _quant;
         }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    } 
        public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    void statuscodigo(){
        Scanner entrada = new Scanner(System.in);
    codigo = entrada.nextLine();
    System.out.println("O código do produto é:");
    System.out.println(getCodigo());
    }
    void statusnome(){
    System.out.println("O nome do produto é:");
    System.out.println(getNome());
    }
    void statustipo(){
    System.out.println("O tipo de produto é:");
        System.out.println(getTipo());
    }
    void statusvalor(){
    System.out.println("O valor do produto é:");
        System.out.println(getValor());
    }
    void statusquant(){
    System.out.println("A quantidade do produto é:");
        System.out.println(getQuant());
    }
    }
