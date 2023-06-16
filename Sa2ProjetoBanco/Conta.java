package Sa2ProjetoBanco;

import javax.swing.JOptionPane;

public abstract class Conta {
    // atributos
    String nome;
    int nConta;
    double saldo;

    // set get
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque() {
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja sacar: "));
        if (saque <= saldo) {
            double resultado = saldo - saque;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!"
                    + "\n Saldo atual: "
                    + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }
    }

    public void deposito() {
        double depositar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja depositar: "));
        double resultado = saldo + depositar;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!"
                + "\n Saldo atual: "
                + resultado);
    }

    public void emprestimo() {
        double emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que deseja emprestar: "));
        double resultado = saldo + emprestimo;
        JOptionPane.showMessageDialog(null, "Emprestimo realizado com sucesso!"
                + "\n Saldo atual: "
                + resultado);
    }
}