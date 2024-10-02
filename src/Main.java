import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno;
        String matricula;
        double nota;
        int qtdFichas = 4;
        Ficha ficha = new Ficha();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < qtdFichas; i++) {
            System.out.println("Informe a matricula do "
                    + (i + 1) + "° aluno.");
            matricula = scanner.nextLine();
            System.out.println("Informe a nota do "
                    + (i + 1) + "° aluno.");
            nota = scanner.nextInt();
            aluno = new Aluno(matricula, nota);
            ficha.comparadorDeNotas(aluno);
//            ficha.comparadorDeNotas(new Aluno(matricula, nota));
        }

        System.out.println();
        System.out.println(ficha.mostrarNotas());

    }
}