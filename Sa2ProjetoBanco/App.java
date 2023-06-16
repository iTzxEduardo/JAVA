package Sa2ProjetoBanco;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        // criar os vetores de objetos
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        // int usadas(separadas)
        int contPF = 0;
        int contPJ = 0;
        int contaAtualPF = 0;
        int contaAtualPJ = 0;
        
        boolean aberta = true;
        boolean novaConta = true;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha ação desejada:"
                            + "\n 1-Abrir Conta"
                            + "\n 2-Acessar Conta"
                            + "\n 3-Sair"));

            if (acao == 1) {
                while (novaConta) {
                    int decisao = Integer.parseInt(JOptionPane.showInputDialog(
                            "Qual conta deseja Criar:"
                                    + "\n 1-Conta Pessoal"
                                    + "\n 2-Conta Juridica"));

                    if (decisao == 1) {
                        contasPf[contPF] = new ContaPF();
                        contasPf[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        contasPf[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                        contasPf[contPF].setSaldo(0);
                        contasPf[contPF].setnConta(1000 + contPF);
                        JOptionPane.showMessageDialog(null, "Conta Criada com Sucesso!");
                        contPF++;
                        novaConta = false;

                    } else if (decisao == 2) {
                        contasPj[contPJ] = new ContaPJ();
                        contasPj[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        contasPj[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
                        contasPj[contPJ].setSaldo(0);
                        contasPj[contPJ].setnConta(2000 + contPJ);
                        JOptionPane.showMessageDialog(null, "Conta criada com Sucesso!");
                        contPJ++;
                        novaConta = false;

                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                    }
                }

            } else if (acao == 2) {
                boolean entrarConta = true;
                while (entrarConta) {
                    int acessarConta = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Escolha qual tipo de conta deseja acessar"
                                            + "\n 1 - Conta Pessoa Fisica"
                                            + "\n 2 - Conta Pessoa Juridica"));

                    if (acessarConta == 1) {
                        int nContaBuscaPF = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº de sua conta:"));
                        int i = 0;

                        while (nContaBuscaPF != contasPf[i].getnConta()) {
                            contaAtualPF = i;
                            i++;
                        }
                        JOptionPane.showMessageDialog(null, "Conta Encontrada!");

                        boolean dadosPF = true;
                        while (dadosPF) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                    + "\n 1 - Verificar saldo."
                                    + "\n 2 - Saque."
                                    + "\n 3 - Depósito."
                                    + "\n 4 - Empréstimo."
                                    + "\n 5 - Sair da conta."));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null, "Saldo: " + contasPf[contaAtualPF].getSaldo());
                            } else if (acao2 == 2) {
                                contasPf[contaAtualPF].saque();
                            } else if (acao2 == 3) {
                                contasPf[contaAtualPF].deposito();
                            } else if (acao2 == 4) {
                                contasPf[contaAtualPF].emprestimo();
                            } else if (acao2 == 5) {
                                dadosPF = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                            }
                        }
                    } else if (acessarConta == 2) {
                        int nContaBuscaPF = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                        int i = 0;
                        while (nContaBuscaPF != contasPf[i].getnConta()) {
                            contaAtualPF = i;
                            i++;
                        }
                        JOptionPane.showMessageDialog(null, "Conta Encontrada!");
                        boolean dadosPJ = true;
                        while (dadosPJ) {
                            int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                    + "\n 1 - Verificar saldo."
                                    + "\n 2 - Saque."
                                    + "\n 3 - Depósito."
                                    + "\n 4 - Empréstimo."
                                    + "\n 5 - Sair da conta."));
                            if (acao3 == 1) {
                                JOptionPane.showMessageDialog(null, "Saldo: " + contasPj[contaAtualPJ].getSaldo());
                            } else if (acao3 == 2) {
                                contasPj[contaAtualPJ].saque();
                            } else if (acao3 == 3) {
                                contasPj[contaAtualPJ].deposito();
                            } else if (acao3 == 4) {
                                contasPj[contaAtualPJ].emprestimo();
                            } else if (acao3 == 5) {
                                dadosPJ = false;
                            } else {
                                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                    }
                }
            } else if (acao == 3) {
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                aberta = false;
            } else {
                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
            }

        }
    }

}