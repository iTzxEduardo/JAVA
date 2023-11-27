package Controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.VendasDAO;
import Model.Vendas;
import View.VendasPainel;

/**
 * VendasControl
 */
public class VendasControl {
    // Atributos
    private List<Vendas> vendas;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public VendasControl(List<Vendas> vendas2, DefaultTableModel tableModel, JTable table) {
        this.vendas = vendas2;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos CRUD

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        vendas = new VendasDAO().listarTodos();
        // Obtém as vendas atualizadas do banco de dados
        for (Vendas venda : vendas) {
            // Adiciona os dados de cada venda como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { venda.getCarros(), venda.getCliente(), venda.getValorVenda() });
        }
    }

    // Método para cadastrar uma nova venda no banco de dados
    public void cadastrar(String carros, String cliente, String valorVenda) {
        new VendasDAO().cadastrar(carros, cliente, valorVenda);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    // Método para atualizar os dados de uma venda no banco de dados
    public void atualizar(String carros, String cliente, String valorVenda) {
        new VendasDAO().atualizar(carros, cliente, valorVenda);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar uma venda do banco de dados
    public void apagar(String carros) {
        new VendasDAO().apagar(carros);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}