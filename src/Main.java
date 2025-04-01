public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Boa tarde!");
        System.out.println("Aqui está o resultado da divisão de alunos por sala:");
        int alunos = 513;
        int salas;
        salas = 24;
        int divisao;
        divisao = (alunos) / (salas);
        System.out.println("A quantidade de alunos por sala é: " + (divisao));
        System.out.println("Alunos restantes: " + ((alunos) - ((divisao) * (salas))));
    }
}