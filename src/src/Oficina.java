public class Oficina extends Evento {
    protected String pratica;
    protected String organizador;


    public Oficina(String curso, String titulo, String local, String descricao, String dtEvento, String horario, int totalVagas, String tipo,
                   String pratica, int dia, String organizador){
        super(curso, titulo, local, descricao, dtEvento, horario, totalVagas, tipo, dia);
        this.pratica = pratica;
    }

    public String getPratica() {
        return pratica;
    }

    public void setPratica(String pratica) {
        this.pratica = pratica;
    }



}
