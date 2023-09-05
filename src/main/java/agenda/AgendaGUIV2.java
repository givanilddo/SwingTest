package agenda;

import javax.swing.*;
import java.awt.*;

public class AgendaGUIV2 extends JFrame {

    JLabel linha1, linha2;

    ImageIcon sportImg = new ImageIcon("./src/main/resources/sport.jpg");

    public AgendaGUIV2() {
        setTitle("agenda.Agenda de Aniversário do sport");
        setSize(1500, 1500);
        setLocation(150, 150);
        setResizable(true);

        getContentPane().setBackground(Color.BLACK);
        linha1 = new JLabel("Sport", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(sportImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3, 1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUIV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    }

