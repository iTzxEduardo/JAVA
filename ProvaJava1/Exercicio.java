package ProvaJava1;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Exercicio {
    Scanner sc = new Scanner(System.in);
    public void Exercicio1() {
        System.out.println("Digite o primero numero ");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Digite o segundo numero ");
        double SegundoNumero = sc.nextDouble();
        System.out.println("Digite 1 para ADIÇÃO.2 Para SUBTAÇÃO.3 para MULTIPLICAÇÃO.4 para DIVISÃO");
        int conta = sc.nextInt();
        if (conta == 1) {
            System.out.println("O resultado é " + (primeiroNumero + SegundoNumero));
        }
        if (conta == 2) {
            System.out.println("O resultado é " + (primeiroNumero - SegundoNumero));
        }
        if (conta == 3) {
            System.out.println("O resultado é " + (primeiroNumero * SegundoNumero));
        }
        if (conta == 4) {
            System.out.println("O resultado é " + (primeiroNumero / SegundoNumero));
        }
        System.out.println();

    }
    
    public void Exercicio2() {
        System.out.println("digite o kilo de morangos ");
        double morango= sc.nextDouble();
        System.out.println("digite o kilo de maças ");
        double maças =sc.nextDouble();
        System.out.println("digite o kilo de banana ");
        double banana =sc.nextDouble();
      double kg= morango+maças+banana;
      double preco=(morango*2.50)+(maças*1.80)+(banana+1.30);
      if(kg>=8 || preco>=25){System.out.println("O total é "+(preco*10)/100);}else System.out.println("O valor é "+preco);

    }
}

