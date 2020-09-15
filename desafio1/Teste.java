package desafio1;

public class Teste {
    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado(10);
        Retangulo retangulo = new Retangulo(10, 20);
        Circulo circulo = new Circulo(5);

        System.out.println(quadrado.toString());
        System.out.println(retangulo.toString());
        System.out.println(circulo.toString());
    }
}
