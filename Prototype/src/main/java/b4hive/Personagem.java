package b4hive;

public class Personagem implements Cloneable {
    private String nome;
    private String classe;
    private Inventario inventario;
    private int nivel;

    public Personagem(String nome, String classe, Inventario inventario, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.inventario = inventario;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.inventario = inventario.clone();
        return personagemClone;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", arma='" + inventario.getArma() + '\'' +
                ", vidas=" + inventario.getQuantidadeVidas() +
                ", nivel=" + nivel +
                '}';
    }
}
