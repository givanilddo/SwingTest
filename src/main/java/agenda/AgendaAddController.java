package agenda;

import java.awt.event.ActionListener;

import javax.swing.*;

public class AgendaAddController implements ActionListener {
    public AgendaAddController(AgendaGUI agenda, AgendaGUIV3 agendaGUIV3) {
        private Agenda agenda;
        private JFrame janelaPrincipal;

        public AgendaAddController(Agenda agenda, JFrame janela){
            this.agenda = agenda;
            this.janelaPrincipal = janela;
        }
    }
}
