import java.util.ArrayList;

public class Usuario {
    protected String nome;
    protected String dtNasc;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected ArrayList<Evento> minhasInscricoes = new ArrayList<>();



    Usuario(String nome, String dtNasc, String cpf, String telefone, String email) {

        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;

    }
    public void addEvento(Evento evento) {
        this.minhasInscricoes.add(evento);
    }

    public void printMinhasInscricoes(){
        System.out.println(this.minhasInscricoes.toString());
    }

}
