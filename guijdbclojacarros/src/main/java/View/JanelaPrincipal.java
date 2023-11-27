package View;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaPrincipal extends JFrame {

    // criação do tabbedPane para incluir as tabs

    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);

        // criandos as tabs
        // tab1 carros

        CarrosPainel tab1 = new CarrosPainel();
        jTPane.add("Carros", tab1);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PessoasPainel tab2 = new PessoasPainel();
        jTPane.add("Pessoas", tab2);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        VendasPainel tab3 = new VendasPainel();
        jTPane.add("Vendas", tab3);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a aplicação?",
                        "Fechar Aplicação", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    dispose(); // Fecha a janela
                }
            }
        });
    }
    //métodos para tornar a janela visível
public void run(){
    this.setVisible(true);
    }
}