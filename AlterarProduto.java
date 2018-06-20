
package projeto;

import java.util.Scanner;

public class AlterarProduto {
    private int alcoolicaa;
    private int naoAlcoolicaa;
    private String nomea;
    private float valora;
    private String codigoa;
    
    public void AlterarProduto(int _alcoolicaa, int _naoAlcoolicaa, String _nomea, float _valora, String _codigoa){
        
       this.alcoolicaa = _alcoolicaa;
       this.naoAlcoolicaa = _naoAlcoolicaa;
       this.nomea = _nomea;
       this.valora = _valora;
       this.codigoa = _codigoa;
       
       System.out.println("Escolha pelo tipo de alteração:");
    }

    public int getAlcoolicaa() {
        return alcoolicaa;
    }

    public void setAlcoolicaa(int alcoolicaa) {
        this.alcoolicaa = alcoolicaa;
    }

    public int getNaoAlcoolicaa() {
        return naoAlcoolicaa;
    }

    public void setNaoAlcoolicaa(int naoAlcoolicaa) {
        this.naoAlcoolicaa = naoAlcoolicaa;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public float getValora() {
        return valora;
    }

    public void setValora(float valora) {
        this.valora = valora;
    }

    public String getCodigoa() {
        return codigoa;
    }

    public void setCodigoa(String codigoa) {
        this.codigoa = codigoa;
    }
            Scanner entrada = new Scanner(System.in);
          int alterar = entrada.nextInt();
}
