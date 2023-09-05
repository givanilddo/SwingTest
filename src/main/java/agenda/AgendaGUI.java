package agenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class AgendaGUI extends JFrame  {
    public AgendaGUI(){
        setTitle("agenda.Agenda de Aniversarios");
        setSize( 500, 500);
        setLocation(150,150);

        setResizable(true);
        getContentPane().setBackground(Color.green);

    }

    public static void main(String[] args) {
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}


