public class Estudante {

    String nome;
    int matricula;
    boolean mensalidadeDia;

    Boletim boletim;
    Frequencia frequencia;

    public Estudante(String nome, int matricula, boolean mensalidadeDia, Boletim boletim, Frequencia frequencia) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidadeDia = mensalidadeDia;
        this.boletim = boletim;
        this.frequencia = frequencia;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public boolean isMensalidadeDia() {
        return mensalidadeDia;
    }

    public double getMedia() {
        return boletim.calcularMedia();
    }

    public int getFaltas() {
        return frequencia.getFaltas();
    }
}