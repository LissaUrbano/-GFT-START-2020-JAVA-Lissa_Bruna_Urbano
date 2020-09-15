package desafio1;

public class Circulo implements AreaCalculavel{
    
    //atributo
    private double raio;

    //construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //sobrescrevendo metodo
    @Override
    public double calcularArea() {
        return (raio*raio)* Math.PI; 
    }
    
    //getters e setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Area do Circulo =" + this.calcularArea();
    }
}
