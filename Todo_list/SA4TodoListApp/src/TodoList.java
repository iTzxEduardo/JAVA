//Imports
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Criação da classe, sendo uma extensão de JFrame
public class TodoList extends JFrame { // Extends significa fazer uma subclasse de JFrame

    // ATRIBUTOS
    private JPanel mainPanel;
    private JTextField taskInputField;
    private JButton addButton;

    // Componenetes novos
    // Ambas são da classe swing, ou seja, é focado para criação de tabelas.
    // Basicamente ela pega as listas que existem no meu sistema e a colocam de uma
    // forma grafica

    private JList<String> taskList; // JList é uma lista grafica, no caso pega so elementos da classe Task lá em
                                    // baixo
    private DefaultListModel<String> listModel;

    private JButton deleteButton;
    private JButton markDoneButton;
    private JComboBox<String> filterComboBox;
    private JButton clearCompletedButton;

    private List<Task> tasks;// Interface de Arraylist, não é possível instanciar deve ser usado o Arraylist

    // Construtor
    public TodoList() {
        // Configuração da janela principal
        super("To-Do List App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 450, 400);

        // Inicializa o painel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>(); // Task é o nome da minha list, não é possível instanciar objeots da classe list
        listModel = new DefaultListModel<>(); // Seta os modelos
        taskList = new JList<>(listModel);

        // Inicializa campos de entrada, botões e JComboBox
        taskInputField = new JTextField();
        addButton = new JButton("Adicionar");
        deleteButton = new JButton("Excluir");
        markDoneButton = new JButton("Concluir");
        filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas", "Concluídas" });
        clearCompletedButton = new JButton("Limpar Concluídas");

        // Configuração do painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskInputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Configuração do painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(deleteButton);
        buttonPanel.add(markDoneButton);
        buttonPanel.add(filterComboBox);
        buttonPanel.add(clearCompletedButton);

        // Adiciona os componentes ao painel principal
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);// ScrollPane, é baseada na taskList
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Adiciona o painel principal à janela
        this.add(mainPanel);


        // Fazendo o tratamento de eventos com o metodo Handler
        Handler hand = new Handler(); // Criação de uma obj Handler

        taskList.addMouseListener(hand); // Chamando um obj Handler
        taskInputField.addKeyListener(hand);
        addButton.addKeyListener(hand);
        this.addWindowListener(hand);
        taskList.addMouseListener(hand);
        taskInputField.addKeyListener(hand);

        // TRATAMENTO DE EVENTOS
        addButton.addActionListener(e -> {
            addTask(); // Chama o metodo addTask
        });
        deleteButton.addActionListener(e -> {
            deleteTask();

        });  
        markDoneButton.addActionListener(e -> {
            markTaskDone();

        });
        filterComboBox.addActionListener(e -> {
            filterTasks();

        });
        clearCompletedButton.addActionListener(e -> {
            clearCompletedTasks();

        });

    }

    /**
     * Handler
     */

    public class Handler implements MouseListener, MouseMotionListener, KeyListener, WindowListener {
        //Evento de Mouse
       //É necessário chamar todos os implementos, mesmo aqueles que não receberem função
        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }

        @Override
        public void mouseClicked(MouseEvent e) { // Click do mouse
            if (e.getClickCount() == 2) {
                //Percorre o Arraylist, pegando os INDEX
                int index = taskList.getSelectedIndex();
                if (index >= 0 && index < tasks.size()) {
                    Task task = tasks.get(index); // Pegou o elemento do arraylist
                    task.setDone(true); // Usando o Setters do outro metodo
                        markTaskDone();
                }
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) { // ESTA EM CIMA
        }

        @Override
        public void mouseExited(MouseEvent e) { // não tem nada
        }

        @Override
        public void mousePressed(MouseEvent e) { // Pressionado
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // EVENTO TECLADO

        // Adionar uma tarefa apertando a tecla ENTER
        @Override
        public void keyPressed(KeyEvent e) {
            // if para comparar se o que foi digitado é igual a tecla Enter
            if (e.getKeyCode() == KeyEvent.VK_ENTER) { // VK.ENTER é o codigo para a tecla enter
                // Perguntar se deseja adcionar
                // Chama o metodo addTask.
                try {
                    if (!taskInputField.getText().isEmpty()) {
                        addTask();
                    }

                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, "erro");
                    // estiver vazio
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }


        // Eventos de WindowListeners
        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowOpened(WindowEvent e) {
            //Chama o Metodo
            abrirJFrame();
        }

    }

    //Metodo criado para inicio
    public void abrirJFrame() {
        int ativarJFrame = 0;
        this.setVisible(false);
        ativarJFrame = JOptionPane.showConfirmDialog(null, "SEJA BEM VINDO!\n DESEJA INICIAR?", "BEM VINDO",
                ativarJFrame);

        if (ativarJFrame == JOptionPane.YES_OPTION) {
            this.setVisible(true);
        }
    }

    // FUNÇÕES

    // CREATE, C DO CRUD
    private void addTask() {
        // Adiciona uma nova task à lista de tasks
        int funciona; // Variavel criada para receber valor do JOptionPane
        funciona = JOptionPane.showConfirmDialog(null, "Deseja realmente adicionar tarefa:");
        // Para funcionar tanto no apertar do botão quanto para ao pressionar a tecla
        // ENTER
        if (funciona == JOptionPane.YES_OPTION) { // Se a escolha for SIM
            String taskDescription = taskInputField.getText().trim();// TRIM = remove espaços vazios
            if (!taskDescription.isEmpty()) { //Se estiver diferente de vazio
                Task newTask = new Task(taskDescription);
                tasks.add(newTask); //Adicionando novas tarefas ao Array
                updateTaskList();// Chama o outro metodo
                taskInputField.setText("");
            }
        } else if (funciona == JOptionPane.NO_OPTION) { // Se a escolha for NÃO
            taskInputField.setText("");
        } // Se a escolha for CANCEL o JOption ira apenas fechar.
    }

    // DELETE, D DO CRUD
    private void deleteTask() {
        // Exclui a task selecionada da lista de tasks
        int selectedIndex = taskList.getSelectedIndex();
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        } // Pega o index da tarefa que esta selecionado
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) { // Vê se ela existe
            tasks.remove(selectedIndex); // tasks é o meu Arraylist
            updateTaskList(); // Atualiza o Scroll
        }
    }

    // UPDATE, U do CRUD
    private void markTaskDone() {
        // Marca a task selecionada como concluída
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex); // Pegou o elemento do arraylist
            task.setDone(true); // Usando o Setters do outro metodo
            updateTaskList(); // Atualiza a tasklist
        }
    }

    // READ, R do CRUD
    private void filterTasks() {
        // Filtra as tasks com base na seleção do JComboBox
        String filter = (String) filterComboBox.getSelectedItem();
        listModel.clear();
        // FOREACH percorre o meu Arraylist
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") &&
                    !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task.getDescription());
            }
        }
    }

    private void clearCompletedTasks() {
        // Limpa todas as tasks concluídas da lista
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isDone()) {
                completedTasks.add(task);
            }
        }
        tasks.removeAll(completedTasks);
        updateTaskList();
    }

    private void updateTaskList() {
        // Atualiza a lista de tasks exibida na GUI
        listModel.clear();
        for (Task task : tasks) {
            if (task.isDone()) {
                listModel
                        .addElement("<html><font color='green'>" + task.getDescription() + "(Concluida)</font></html>");
            } else {
                listModel.addElement(task.getDescription());
            }
            // listModel é a lista simplificada chamado ternário

        }
    }

    public void run() {
        this.setVisible(true);
    }

}
