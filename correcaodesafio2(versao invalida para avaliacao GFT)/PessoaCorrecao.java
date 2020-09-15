package desafio2;
//correção efetuada após conclusão do teste, portanto, invalida para analise do teste GFT START.

public abstract class PessoaCorrecao {
    
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

    public PessoaCorrecao(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }
}
