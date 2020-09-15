package desafio1;

public class Retangulo implements AreaCalculavel {

    //atributo
    private double largura;
    private double altura;

    //construtor
  	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

    //sobrescrevendo metodo
    @Override
    public double calcularArea() {
        return this.getLargura() * this.getAltura();
    }

    //getters e setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    @Override
    public String toString() {
        return "Area do Retangulo =" + this.calcularArea();
    }
}
