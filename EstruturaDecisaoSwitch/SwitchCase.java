package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Informe uma letra");
        String letraDigitada = sc.nextLine();
        switch (letraDigitada) {
            case "a":
                System.out.println(letraDigitada + " É vogal ");
                break;
            case "e":
                System.out.println(letraDigitada + " É vogal ");
                break;
            case "i":
                System.out.println(letraDigitada + " É vogal ");
                break;
            case "o":
                System.out.println(letraDigitada + " É vogal ");
                break;
            case "u":
                System.out.println(letraDigitada + " É vogal ");
                break;
            default:
                System.out.println(letraDigitada + " É consoante ");
                break;
        }
    }

    public void mes() {
        System.out.println("informe um numero");
        int numeroDigitado = sc.nextInt();
        switch (numeroDigitado) {
            case 1:
                System.out.println(numeroDigitado + " Janeiro ");
                break;
            case 2:
                System.out.println(numeroDigitado + " Fevereiro ");
                break;
            case 3:
                System.out.println(numeroDigitado + " Marcio ");
                break;
            case 4:
                System.out.println(numeroDigitado + " Abril ");
                break;
            case 5:
                System.out.println(numeroDigitado + " Maio ");
                break;
            case 6:
                System.out.println(numeroDigitado + " Junho ");
                break;
            case 7:
                System.out.println(numeroDigitado + " Julho ");
                break;
            case 8:
                System.out.println(numeroDigitado + " Agosto ");
                break;
            case 9:
                System.out.println(numeroDigitado + " Setembro ");
                break;
            case 10:
                System.out.println(numeroDigitado + " Outubro ");
                break;
            case 11:
                System.out.println(numeroDigitado + " Novembro ");
                break;
            case 12:
                System.out.println(numeroDigitado + " Dezembro ");
                break;
            default:
                System.out.println(numeroDigitado + " Numero digitado n coresponde a um mês ");
                break;
        }

    }
}
