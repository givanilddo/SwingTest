package agenda;

public class Contato {
    private int nome;
    private int dia;
    private int mes;

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getDiaAniversario() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMesAniversario() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Contato(String nome, int dia, int mes) {
        this.nome = Integer.parseInt(nome);
        this.dia = dia;
        this.mes = mes;
    }
}
