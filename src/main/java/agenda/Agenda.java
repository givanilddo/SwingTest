package agenda;

import java.util.Collection;
public interface Agenda {
    public boolean cadastraContato(String nome, int dia, int mes);
    public Colleciton<Contato> pesquisaAniversariantes(int dia, int mes);
    public boolean removeContato(String nome);
}
