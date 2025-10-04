import java.util.ArrayList;

public class Evento {

    protected String curso;
    protected String titulo;
    protected String local;
    protected String centroAcademico;
    protected String descricao;
    protected String dtEvento;
    protected String horario;
    protected int dia;
    protected int totalVagas;
    protected ArrayList<Usuario> inscritos;
    protected String tipo;

    public Evento(String curso, String titulo, String local, String centroAcademico, String descricao, String dtEvento,
                  String horario, int totalVagas, String tipo, int dia) {
        this.curso = curso;
        this.titulo = titulo;
        this.local = local;
        this.descricao = descricao;
        this.dtEvento = dtEvento;
        this.horario = horario;
        this.totalVagas = totalVagas;
        this.tipo = tipo;
        this.centroAcademico = centroAcademico;
        this.dia = dia;
    }

    public String getCurso() {
        return curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLocal() {
        return local;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtEvento() {
        return dtEvento;
    }

    public String getHorario() {
        return horario;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public ArrayList<Usuario> getInscritos() {
        return inscritos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCentroAcademico(){
        return centroAcademico;
    }

    public int getDia() {
        return dia;
    }
}

