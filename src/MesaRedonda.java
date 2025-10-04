public class MesaRedonda extends Evento{

    protected String convidado;

    public MesaRedonda(String curso, String titulo, String local, String descricao, String dtEvento, String horario, int totalVagas, String tipo,
                       String convidado, int dia){
        super(curso, titulo, local, descricao, dtEvento, horario, totalVagas, tipo, dia);
        this.convidado = convidado;
    }

    public String getConvivdado() {
        return convidado;
    }

    public void setConvivdado(String convivdado) {
        this.convidado = convivdado;
    }



}
