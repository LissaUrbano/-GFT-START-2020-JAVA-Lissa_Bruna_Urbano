package desafio2;
//correção efetuada após conclusão do teste, portanto, invalida para analise do teste GFT START.

public class ProgramaCorrecao {
    public static void main(String[] args) {
        
        FuncionarioCorrecao funcionario = new FuncionarioCorrecao("Lissa", "55446886", 1000);

        funcionario.setPercentual(1.5);
        funcionario.aumentarSalario(); // aumento 2017
        System.out.println("Salário em 2017: " + funcionario.getSalarioTotal()); 

        funcionario.setPercentual(3.0);
        funcionario.aumentarSalario(); // aumento 2018
        System.out.println("Salário em 2018: " + funcionario.getSalarioTotal()); 

        funcionario.setPercentual(6.0);
        funcionario.aumentarSalario(); // aumento 2019
        System.out.println("Salário em 2019: " + funcionario.getSalarioTotal()); 

        funcionario.setPercentual(12.0);
        funcionario.aumentarSalario(); // aumento 2020

        System.out.println(funcionario.toString());
        System.out.println("Salário em 2020: " + funcionario.getSalarioTotal());
    }
}
