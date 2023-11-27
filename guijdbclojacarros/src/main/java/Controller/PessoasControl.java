package Controller;

import java.util.List;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import Model.Pessoas;


public class PessoasControl {
        // atributos
    private List<Pessoas> pessoas;
    private DefaultTableModel tableModel;
    private JTable table;

        // construtor
    public PessoasControl(List<Pessoas> pessoas, DefaultTableModel tableModel, JTable table) {
        this.pessoas = pessoas;
        this.tableModel = tableModel;
        this.table = table;
}
        // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        pessoas = new PessoasDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Pessoas pessoas : pessoas) {
            // Adiciona os dados de cada pessoas como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { pessoas.getNome(), pessoas.getEndereco(),

                    pessoas.getFone(), pessoas.getCpf()});
        }
    }
    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String nome, String endereco, int fone, int cpf) {
        new PessoasDAO().cadastrar(nome, endereco, fone, cpf);
        
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
        
    }
        // Método para cadastrar um novo carro no banco de dados
    public void atualizar(String nome, String endereco, int fone, int cpf) {
        new PessoasDAO().atualizar(nome, endereco, fone, cpf);
        
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
        
    }
    // Método para cadastrar um novo carro no banco de dados
    public void apagar( int cpf) {
        new PessoasDAO().apagar( cpf);
        
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro

        
        
    }
 
}