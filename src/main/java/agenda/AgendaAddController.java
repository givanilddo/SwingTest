package agenda;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class AgendaAddController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaAddController(Agenda agenda, JFrame janela) {
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do aniversariante");

        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o dia do mês em que nasceu? [1-31"));

        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o mês em que nasceu? [1-12]"));
        boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
        if (cadastrou) {
            JOptionPane.showInputDialog(janelaPrincipal,
                    "Aniversariante Cadastrado");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Aniversariante não foi cadastrado. " +
                            "Verifique se já não existia");
        }
    }
}



