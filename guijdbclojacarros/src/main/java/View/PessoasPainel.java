package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;

import Controller.PessoasDAO;
import Controller.PessoasControl;

import Model.Pessoas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

public class PessoasPainel extends JPanel {

     // Atributos(componentes)

    private JButton cadastrar, apagar, editar;
    private JTextField pessoaNomeField, pessoaEnderecoField, pessoaFoneField, pessoaCPFField;
    private List<Pessoas> pessoas;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    //Construtor(GUI-JPanel)

    public PessoasPainel(){

        //entrada de dados

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro de Pessoas"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Nome"));
        pessoaNomeField = new JTextField(20);
        inputPanel.add(pessoaNomeField);
        inputPanel.add(new JLabel("Endereço"));
        pessoaEnderecoField = new JTextField(20);
        inputPanel.add(pessoaEnderecoField);
        inputPanel.add(new JLabel("Telefone"));
        pessoaFoneField = new JTextField(20);
        inputPanel.add(pessoaFoneField);
        inputPanel.add(new JLabel("CPF"));
        pessoaCPFField = new JTextField(20);
        inputPanel.add(pessoaCPFField);
        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        //tabela de cadastro

        JScrollPane jSPane= new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
        new String[]{ "Nome", "Endereço", "Telefone", "CPF" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

     // Cria o banco de dados caso não tenha sido criado
        new PessoasDAO().criaTabela();

        // incluindo elementos do banco na criação do painel
        atualizarTabela();

        // tratamento de Eventos
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    pessoaNomeField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    pessoaEnderecoField.setText((String) table.getValueAt(linhaSelecionada, 2));
                    pessoaFoneField.setText((String) table.getValueAt(linhaSelecionada, 3));
                    pessoaCPFField.setText((String) table.getValueAt(linhaSelecionada, 4));
                }
            }
        });
  // Cria um objeto operacoes da classe PessoasControl para executar operações no
        // banco de dados
        PessoasControl operacoes = new PessoasControl(pessoas, tableModel, table);

        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco de dados 
        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de
                // entrada
                operacoes.cadastrar(pessoaNomeField.getText(), pessoaEnderecoField.getText(),Integer.parseInt(pessoaFoneField.getText()), Integer.parseInt(pessoaCPFField.getText()));

                // Limpa os campos de entrada após a operação de cadastro
                pessoaNomeField.setText("");
                pessoaEnderecoField.setText("");
                pessoaFoneField.setText("");
                pessoaCPFField.setText("");
                
            }
        });

        // Configura a ação do botão "editar" para atualizar um registro no banco de
        // dados
        editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                operacoes.atualizar(pessoaNomeField.getText(), pessoaEnderecoField.getText(),Integer.parseInt(pessoaFoneField.getText()), Integer.parseInt(pessoaCPFField.getText()));
                // Limpa os campos de entrada após a operação de atualização
                pessoaNomeField.setText("");
                pessoaEnderecoField.setText("");
                pessoaFoneField.setText("");
                pessoaCPFField.setText("");
                
            }
        });

        // Configura a ação do botão "apagar" para excluir um registro no banco de dados
        apagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método "apagar" do objeto operacoes com o valor do campo de entrada
                // "placa"
                operacoes.apagar(Integer.parseInt(pessoaCPFField.getText()));

                // Limpa os campos de entrada após a operação de exclusão
                pessoaNomeField.setText("");
                pessoaEnderecoField.setText("");
                pessoaFoneField.setText("");
                pessoaCPFField.setText("");
              
            }
        });

    }

    // atualizar Tabela de Carros com o Banco de Dados
    private void atualizarTabela() {
        // atualizar tabela pelo banco de dados
        tableModel.setRowCount(0);
        pessoas = new PessoasDAO().listarTodos();
        for (Pessoas pessoa : pessoas) {
            tableModel.addRow(new Object[] { pessoa.getNome(), pessoa.getEndereco(), pessoa.getFone(), pessoa.getCpf(),});
        }

    }

}


