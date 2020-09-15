package desafio2; 
//correção efetuada após conclusão do teste, portanto, invalida para analise do teste GFT START.

public class FuncionarioCorrecao extends PessoaCorrecao {
    
    //atributos
    private double salarioInicial;
    private double salarioTotal;
    private double percentual;

    //construtor
    public FuncionarioCorrecao(String nome, String rg, double salarioInicial) {
    super(nome, rg);
    this.salarioInicial = salarioInicial;
    this.salarioTotal = this.salarioInicial;
    }
    
    public void aumentarSalario(){
        salarioTotal = salarioTotal + (salarioTotal * (percentual/100));
    }

    //getters e setters
    public double getSalarioInicial() {
        return salarioInicial;
    }

    public void setSalarioInicial(double salarioInicial) {
        this.salarioInicial = salarioInicial;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
