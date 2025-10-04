public class Oficina extends Evento {
    protected String pratica;
    protected String organizador;


    public Oficina(String curso, String titulo, String local, String centroAcademico, String descricao, String dtEvento, String horario, int totalVagas, String tipo,
                   String pratica, int dia, String organizador){
        super(curso, titulo, local, centroAcademico, descricao, dtEvento, horario, totalVagas, tipo, dia);
        this.pratica = pratica;
        this.organizador = organizador;
    }

    public String getPratica() {
        return pratica;
    }

    public void setPratica(String pratica) {
        this.pratica = pratica;
    }



}
