package agenda;
public class AgendaGIL implements Agenda{
    private Map<String, Contato> contatos;

    public AgendaGIL(){
        this.contatos = new HashMap<>();
    }

    public boolean cadastraContato(String nome, int dia, int mes){
        if(contatos.containsKey(nome)){
            this.contatos.put(nome, new Contato(nome, dia, mes));
            return true;
        } else{
            return false;
        }
    }
}
