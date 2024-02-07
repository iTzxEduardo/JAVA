package todolist.Controller.Connection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import todolist.Model.Task;

public class ListControl {

    // AQUI É ONDE SE AFUNILA AS INFOMAÇÕES

    // Atributos
    private List<Task> tasks;
    private DefaultTableModel tableModel;
    private JTable table;

    // Construtor
    public ListControl(List<Task> tasks, DefaultTableModel tableModel, JTable table) {
        this.tasks = tasks;
        this.tableModel = tableModel;
        this.table = table;

    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        tasks = new ListDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Task tarefa : tasks) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { tarefa.getDescription(), tarefa.isDone() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String tarefa, String concluida) {
        new ListDAO().cadastrar(tarefa, concluida);
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro

    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String tarefa, String concluida, String id) {
        new ListDAO().atualizar(tarefa, concluida, id);
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String id) { // Placa é a minha chave primária
        new ListDAO().apagar(id);
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}