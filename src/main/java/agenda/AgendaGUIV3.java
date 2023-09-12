package agenda;

import javax.swing.*;
import java.awt.*;

public class AgendaGUIV3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon sportImg = new ImageIcon("./src/main/resources/sport.jpg");
    ImageIcon addImg = new ImageIcon("./src/main/resources/add.png");
    ImageIcon searchImg = new ImageIcon("./src/main/resources/search.png");
    ImageIcon removeImg = new ImageIcon("./src/main/resources/remove.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    Agenda agenda = new AgendaGIL();


    public AgendaGUIV3() {
        setTitle("agenda.Agenda de Aniversário do sport");
        setSize(1500, 1500);
        setLocation(150, 150);
        setResizable(true);

        getContentPane().setBackground(Color.WHITE);

        linha1 = new JLabel("Sport", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(sportImg, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar", addImg);
        botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
        botaoPesquisar = new JButton("Pesquisar", searchImg);
        botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));

        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
