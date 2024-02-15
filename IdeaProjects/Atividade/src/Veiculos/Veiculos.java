package Veiculos;
interface Acionar {
    void acionar();
}
public class Veiculos{
    private String cor;

        public String getCor() {
        return cor;
    }
    private String modelo;

        public String getModelo() {
        return modelo;
    }

    private int ano;

        public void setAno(int ano) {
        this.ano = ano;
    }

    public void acionar(){

    }
}
