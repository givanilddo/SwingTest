package agenda;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Collection;

public class AgendaSearchController  implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaSearchController(Agenda agenda, JFrame janela) {
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o dia do mês em que nasceu? [1-31"));

        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o mês em que nasceu? [1-12]"));
        Collection<Contato> aniversariantes = agenda.pesquisaAniversariantes(dia, mes);

        if (aniversariantes.size() > 0) {
            JOptionPane.showInputDialog(janelaPrincipal,
                    "Aniversariantes encontrados: ");
            for (Contato c : aniversariantes) {
                JOptionPane.showMessageDialog(janelaPrincipal, c.toString());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Não foi encontrado nenhum aniversariante nesta data");
        }
    }
}

