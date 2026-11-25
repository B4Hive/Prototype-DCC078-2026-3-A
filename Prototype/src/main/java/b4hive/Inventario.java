package b4hive;

public class Inventario implements Cloneable {
    private String arma;
    private int quantidadeVidas;

    public Inventario(String arma, int quantidadeVidas) {
        this.arma = arma;
        this.quantidadeVidas = quantidadeVidas;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getQuantidadeVidas() {
        return quantidadeVidas;
    }

    public void setQuantidadeVidas(int quantidadeVidas) {
        this.quantidadeVidas = quantidadeVidas;
    }

    @Override
    public Inventario clone() throws CloneNotSupportedException {
        return (Inventario) super.clone();
    }
}
