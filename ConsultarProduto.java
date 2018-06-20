
package projeto;

import java.util.Scanner;

public class ConsultarProduto {
    private String alcoolica;
    private String naoAlcoolica;
    private float valorc;
    private String nomec;
    private String codigoc;
   
    public void ConsultarProduto(String _alcoolica, String _naoAlcoolica, float _valorc, String _nomec, String _codigoc) {
          this.alcoolica = _alcoolica;
          this.naoAlcoolica = _naoAlcoolica;
          this.valorc = _valorc;
          this.nomec = _nomec;
          this.codigoc  = _codigoc;
          
          System.out.println("Escolha o tipo de pesquisa:");
}
    public String getAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(String alcoolica) {
        this.alcoolica = alcoolica;
    }

    public String getNaoAlcoolica() {
        return naoAlcoolica;
    }

    public void setNaoAlcoolica(String naoAlcoolica) {
        this.naoAlcoolica = naoAlcoolica;
    }

    public float getValorc() {
        return valorc;
    }

    public void setValorc(float valorc) {
        this.valorc = valorc;
    }

    public String getNomec() {
        return nomec;
    }

    public void setNomec(String nomec) {
        this.nomec = nomec;
    }

    public String getCodigoc() {
        return codigoc;
    }

    public void setCodigoc(String codigoc) {
        this.codigoc = codigoc;
    }
    Scanner entrada = new Scanner(System.in);
    int consulta = entrada.nextInt();

}