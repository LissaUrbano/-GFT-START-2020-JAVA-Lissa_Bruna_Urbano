package desafio1;

public class Quadrado implements AreaCalculavel {

    //atributo
    private double lado;

    //construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //sobrescrevendo metodo
    @Override
    public double calcularArea() {
        return this.getLado() * this.getLado();
    }

    //getters e setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Area do Quadrado =" + this.calcularArea();
    }
}
