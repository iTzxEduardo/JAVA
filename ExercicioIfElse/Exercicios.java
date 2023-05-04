package ExercicioIfElse;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Valor1 ");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Valor2 ");
        int Valor2 = sc.nextInt();
        if (valor1 > Valor2) {
            System.out.println("O Maior Valor É " + valor1);
        } else {
            System.out.println("O Maior Valor É " + Valor2);
        }
    }

    public void exercicio2() {
        System.out.println("Infome sua data de nascimento");
        int data = sc.nextInt();
        if (data <= 2005) {
            System.out.println("Voce pode votar ");
        } else {
            System.out.println("Voce nao pode votar");
        }

    }

    public void exercicio3() {
        System.out.println("Digite sua senha ");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

    }

    public void exercicio4() {
        System.out.println("Informe a quantidade de maças ");
        double maca = sc.nextDouble();
        double valorMaca = 0.30;
        double valorCompra;
        if (maca < 12) {
            valorCompra = valorMaca * maca;
        } else {
            valorMaca = 0.25;
            valorCompra = valorMaca * maca;
        }
        System.out.println("O valor de compra é: R$ " + valorCompra);
    }

    public void exercicio5() {
        System.out.println("Informe o numero A");
        int a = sc.nextInt();
        System.out.println("Informe o numero B");
        int b = sc.nextInt();
        System.out.println("Informe o numero C");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("A sequencia é " + a + b + c);
        } else if (a < c && c < b) {
            System.out.println("A sequencia é " + a + c + b);
        } else if (b < a && a < c) {
            System.out.println("A sequencia é " + b + a + c);
        } else if (b < c && c < a) {
            System.out.println("A sequencia é " + b + c + a);
        } else if (c < a && a < b) {
            System.out.println("A sequencia é " + c + a + b);
        } else if (c < b && b < a) {
            System.out.println("A sequencia é " + c + b + a);

        } else
            System.out.println("Não use numeros repitidos");
    }

    public void exercicio6() {
       System.out.println("informe a altura");
       double altura = sc.nextDouble();
       System.out.println("informe 1 para mulher e 2 pra homem ");
       int sexo = sc.nextInt();
       double pesoIdeal;
       if (sexo==1){
        pesoIdeal = 62.1*altura-44.7;
       }else pesoIdeal =72.7*altura-58;
System.out.println("O peso ideal em kg é " + pesoIdeal);
    }


}
