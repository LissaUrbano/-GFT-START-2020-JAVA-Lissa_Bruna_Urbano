package desafio2;

public abstract class Pessoa {
    
    //atributos
    private String nome;
    private String rg;

    //setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", rg=" + rg + "]";
    }

    public Pessoa(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }
}
