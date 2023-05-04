package CalcularNota;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class CalcularNota {
    public void notaFrequencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota 1 do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do Aluno");
        int nota2 = sc.nextInt();
        double mediaAluno = (nota1 + nota2) / 2;
        System.out.println("A Média do Aluno é " +mediaAluno);
        boolean calcularNota = mediaAluno>=50;
    System.out.println("o Aluno está aprovado por nota?" +calcularNota);
    System.out.println("Informe a Frequencia do Aluno");
    int frquenciaAluno = sc.nextInt();
    boolean frequenciaAprovada = frquenciaAluno >=75; 
System.out.println(); 
boolean aprovacaoFinal = (calcularNota==true)&&(frequenciaAprovada==true);
System.out.println("O Aluno está Aprovado no Curso?" +aprovacaoFinal);
}

}
