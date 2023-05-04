package VetoresArrays;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar vetor
        double[] valores = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println(" O 1º Elemento do Vetor - Valores[0] é " + valores[0]);
        System.out.println(" O 2º Elemento do Vetor - Valores[0] é " + valores[1]);
        System.out.println(" O 3º Elemento do Vetor - Valores[0] é " + valores[2]);
        System.out.println(" O 4º Elemento do Vetor - Valores[0] é " + valores[3]);
        System.out.println(" Digite um novo valor para a 4ª posição/indice3 ");
        valores[3] = sc.nextDouble();
        System.out.println(" O novo valor da 4ª posição/indece[3] é " + valores[3]);
    }
    public void exemplo2() {
        //criar um vetor (vazio)
        int valoresInt []= new int[5];
        System.out.println("Digite 5 valores inteiros ");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        System.out.println("O 1º Elemento do vetor - indice[0] "+valoresInt[0]);
        System.out.println("O 2º Elemento do vetor - indice[0] "+valoresInt[1]);
        System.out.println("O 3º Elemento do vetor - indice[0] "+valoresInt[2]);
        System.out.println("O 4º Elemento do vetor - indice[0] "+valoresInt[3]);
        System.out.println("O 1º Elemento do vetor - indice[0] "+valoresInt[4]);
    } 
    public void exemplo3() {
        double valoresDouble[]= new double[10];
        System.out.println("Digite seu numero de matricula ");
        valoresDouble[0]=sc.nextDouble();
        valoresDouble[1]=sc.nextDouble();
        valoresDouble[2]=sc.nextDouble();
        valoresDouble[3]=sc.nextDouble();
        valoresDouble[4]=sc.nextDouble();
        valoresDouble[5]=sc.nextDouble();
        valoresDouble[6]=sc.nextDouble();
        valoresDouble[7]=sc.nextDouble();
        valoresDouble[8]=sc.nextDouble();
        valoresDouble[9]=sc.nextDouble();
        System.out.println("O 1º Elemento do vetor - indice[0] "+valoresDouble[9]);
        System.out.println("O 2º Elemento do vetor - indice[0] "+valoresDouble[8]);
        System.out.println("O 3º Elemento do vetor - indice[0] "+valoresDouble[7]);
        System.out.println("O 4º Elemento do vetor - indice[0] "+valoresDouble[6]);
        System.out.println("O 5º Elemento do vetor - indice[0] "+valoresDouble[5]);
        System.out.println("O 6º Elemento do vetor - indice[0] "+valoresDouble[4]);
        System.out.println("O 7º Elemento do vetor - indice[0] "+valoresDouble[3]);
        System.out.println("O 8º Elemento do vetor - indice[0] "+valoresDouble[2]);
        System.out.println("O 9º Elemento do vetor - indice[0] "+valoresDouble[1]);
        System.out.println("O 10º Elemento do vetor - indice[0] "+valoresDouble[0]);
    }
    public void exemplo4() {
int nota[]=new int[4];
System.out.println("Digite 4 notas ");
nota[0]=sc.nextInt();
nota[1]=sc.nextInt();
nota[2]=sc.nextInt();
nota[3]=sc.nextInt();
double media = (nota[0]+nota[1]+nota[2]+nota[3])/4;
System.out.println("Sua media é "+media);

}
}