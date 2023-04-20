import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Estudantesmatriculados {
    private final Set<String> alunos;

    public Estudantesmatriculados() {
        this.alunos = new HashSet<>();
    }

    public void addFollower(String aluno) {
        this.alunos.add(aluno);
    }

    public void removeFollower(String aluno) {
        this.alunos.remove(aluno);
    }

    public boolean hasFollower(String aluno) {
        return this.alunos.contains(aluno);
    }

    public int getTotalalunos() {
        return this.alunos.size();
    }

    public static void main(String[] args) {
        Estudantesmatriculados alunos = new Estudantesmatriculados();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("Seus alunos de DSTB");
            System.out.println("1. Adicione aluno");
            System.out.println("2. remover aluno");
            System.out.println("3. Ver se um aluno existe");
            System.out.println("4. Ver todos os alunos");
            System.out.println("5. Sair ");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Coloque o nome do aluno: ");
                    String alunoToAdd = sc.next();
                    alunos.addFollower(alunoToAdd);
                    System.out.println("aluno adicionado.");
                }
                case 2 -> {
                    System.out.print("Coloque o nome do aluno: SUGESTÃO: HENRIQUE ");
                    String alunoToRemove = sc.next();
                    alunos.removeFollower(alunoToRemove);
                    System.out.println("aluno removido.");
                }
                case 3 -> {
                    System.out.print("Coloque o nome do aluno: ");
                    String alunosToCheck = sc.next();
                    if (alunos.hasFollower(alunosToCheck)) {
                        System.out.println("Esse aluno existe.");
                    } else {
                        System.out.println("Esse aluno não existe. ");
                    }
                }
                case 4 -> System.out.println("Total de alunos: " + alunos.getTotalalunos());
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Coloque uma opção valida.");
            }

            System.out.println();
        }

        sc.close();
    }
}