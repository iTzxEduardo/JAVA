package POOInterfaceExercicio2;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        // cria um array de objetos
        Agenda contatos[] = new Agenda[10];
        // criar e preencher os objetos
        for (int i = 0; i < contatos.length; i++) {
            contatos[i] = new Agenda();
            // preencher
            contatos[i].setNome(JOptionPane.showInputDialog("Nome:"));
            contatos[i].setIdade(i+18);
            contatos[i].setAtura(i);
        }
        //busca de um objeto de Agenda(nome)
        String nomeBuscado= JOptionPane.showInputDialog("Informe o nome Buscado");
        int cont =0;//contador
boolean procure=true;
while(procure){//enquanto procure for verdadeiro loop
    if(nomeBuscado.equals(contatos[cont].getNome())){
        procure= false;//parar o laço
        JOptionPane.showMessageDialog(null, "Idade; "+contatos[cont].getIdade()+"    Altura: "+contatos[cont].getAtura() );
    }
    cont++;
}
    }
}
