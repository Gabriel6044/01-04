public class Main {
    public static void main(String[] args) {
        int alunos = 64;
        int salas = 10;
        int divisao  = (alunos) / (salas);
        int resto = (alunos) % (salas);
        System.out.println("Olá, Boa tarde!");
        System.out.println("Há " + (alunos) + " alunos e " + (salas) + " salas.");
        System.out.println("Aqui está o resultado da divisão igualitária por sala:");

        System.out.println("A quantidade de alunos por sala é: " + (divisao));
        System.out.println();

        switch (resto) {
            case 0:
                System.out.println("Não há alunos sobrando.");
                break;
            case 1:
                System.out.println("Há " + (resto) + " aluno sobrando.");
                break;
            default:
                System.out.println("Há " + (resto) + " alunos sobrando.");
                break;
        }

    }
}