package POOInterfaceExercicio;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        //Cadastro pessoa1 = new Cadastro();//default/contrutor vazio
        ;//atribuindo via construtor
        Cadastro pessoa1 = new Cadastro("Fabiana", 1.70, 1988, 12, 20);
        //atribuir valores aos atributos via set
        System.out.println("Informe o Nome novamente");
        pessoa1.setNome(sc.next());

        //utilizar os métodos para o objeto
        System.out.println("A idade é"+pessoa1.calcularIdade());
        pessoa1.imprimirInfo();
        sc.close();
    }
    
}
