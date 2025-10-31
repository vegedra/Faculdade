// Aula POO 30/10/25
// @author: Pedro Ivo
// Programa com GUI em Swing que peça para o usuario colocar
// seu nome e um botão que ao pressionado exiba o nome do usuario na tela.

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private String nome = "";

    public Main() {
        super("Janela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null); // Centraliza a janela

        // Painel principal com layout simples
        JPanel panel = new JPanel(new FlowLayout());

        // Campo de texto
        JLabel text1 = new JLabel("Escreva seu nome:");
        JTextField textNome = new JTextField("", 15);

        // Botão
        JButton button = new JButton("Clique aqui");
        button.setFocusPainted(false);

        // Label para mostrar o nome
        JLabel text2 = new JLabel("Seu nome aparecerá aqui:");
        JLabel text3 = new JLabel();

        // Quando clicar no botão, atualiza o texto do label
        button.addActionListener(e -> {
            nome = textNome.getText();
            text3.setText("Olá, " + nome + "!");
        });

        // Adiciona os componentes ao painel
        panel.add(text1);
        panel.add(textNome);
        panel.add(text2);
        panel.add(text3);
        panel.add(button);

        // Adiciona o painel a janela e exibe tudo
        add(panel);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}