public class Palestra extends Evento{
    protected String palestrante;

    public Palestra(String curso, String titulo, String local, String centroAcademico, String descricao, String dtEvento, String horario, int totalVagas, String tipo,
                    String palestrante, int dia){
        super(curso, titulo, local, centroAcademico, descricao, dtEvento, horario, totalVagas, tipo, dia);
        this.palestrante = palestrante;
    }
}
