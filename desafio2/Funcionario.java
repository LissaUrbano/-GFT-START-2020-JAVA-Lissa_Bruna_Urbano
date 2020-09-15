package desafio2;

import jdk.jfr.Percentage;

public class Funcionario extends Pessoa {
    
    //atributos
    private double salarioInicial;
    private double salarioTotal;
    private Percentage percentual;

    //construtor
    public Funcionario(int anoContratacao, double salarioInicial, Percentage percentual,string nome, String rg) {
    this.salarioInicial = getSalarioInicial();
    this.salarioTotal = salarioTotal;
    this.percentual = getPercentual();
    super(nome, rg);
    }
    
    public double aumentoSalarial(int anoContratacao){

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

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public Percentage getPercentual() {
        return percentual;
    }

    public void setPercentual(Percentage percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario 2020 =" + this.getSalarioTotal();
    }
}
