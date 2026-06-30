public class Principal {

    public static void main(String[] args) {

        Estudante e1 = new Estudante(
                "Ana", 1, true,
                new Boletim(9, 8),
                new Frequencia(2)
        );

        Estudante e2 = new Estudante(
                "Bruno", 2, true,
                new Boletim(5, 6),
                new Frequencia(3)
        );

        Estudante e3 = new Estudante(
                "Carlos", 3, false,
                new Boletim(8, 9),
                new Frequencia(1)
        );

        processar(e1);
        processar(e2);
        processar(e3);
    }

    public static void processar(Estudante e) {

        if (!e.isMensalidadeDia()) {
            System.out.println("Aviso: Dados retidos por pendência financeira");
            System.out.println("Aluno: " + e.getNome());
            System.out.println("----------------------");
            return;
        }

        System.out.println("Aluno: " + e.getNome());
        System.out.println("Matrícula: " + e.getMatricula());
        System.out.println("Média: " + e.getMedia());
        System.out.println("Faltas: " + e.getFaltas());

        if (e.getMedia() >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        System.out.println("----------------------");
    }
}