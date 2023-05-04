package ExercicioWhile;

public class ExerciciosWhile {
    public void Exercicio1() {
        int vetorA[] = new int[] { 3, 5, 7, 9, 11, };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("Vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio2() {
        int vetorA[] = new int[] { 3, 5, 7, 9, 11, 13, 15, 17 };
        int vetorB[] = new int[8];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("Vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio3() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int vetorB[] = new int[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio4() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        double vetorB[] = new double[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("Vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void Exercicio5() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double vetorB[] = new double[15];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = (vetorA[i]) * 1;
            System.out.println("Vetor B[" + i + "]=" + vetorB[i]);
            i++;
        }
    }public void Exercicio6() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorB[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorC[] = new int[20];
        int i = 0;
        while (i < vetorA.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("Vetor C[" + i + "]=" + vetorC[i]);
            i++;
        }
    }
    public void Exercicio7() {
        
        
    }
}
