import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SocialMidiaSeguidores {
    private final Set<String> seguidores;

    public SocialMidiaSeguidores() {
        this.seguidores = new HashSet<>();
    }

    public void addFollower(String follower) {
        this.seguidores.add(follower);
    }

    public void removeFollower(String follower) {
        this.seguidores.remove(follower);
    }

    public boolean hasFollower(String follower) {
        return this.seguidores.contains(follower);
    }

    public int getTotalFollowers() {
        return this.seguidores.size();
    }

    public static void main(String[] args) {
        SocialMidiaSeguidores followers = new SocialMidiaSeguidores();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("SEUS SEGUIDORES");
            System.out.println("1. Adicione seguidor");
            System.out.println("2. remover seguidor");
            System.out.println("3. Ver se um seguidor existe");
            System.out.println("4. Ver total de seguidores");
            System.out.println("5. Sair ");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Coloque o nome do seguidor: ");
                    String followerToAdd = sc.next();
                    followers.addFollower(followerToAdd);
                    System.out.println("Seguidor adicionado.");
                }
                case 2 -> {
                    System.out.print("Coloque o nome do seguidor: ");
                    String followerToRemove = sc.next();
                    followers.removeFollower(followerToRemove);
                    System.out.println("Seguidor removido.");
                }
                case 3 -> {
                    System.out.print("Coloque o nome do seguidor: ");
                    String followerToCheck = sc.next();
                    if (followers.hasFollower(followerToCheck)) {
                        System.out.println("Esse seguidor existe.");
                    } else {
                        System.out.println("Esse seguidor não existe. ");
                    }
                }
                case 4 -> System.out.println("Total de seguidores: " + followers.getTotalFollowers());
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Coloque uma opção valida.");
            }

            System.out.println();
        }

        sc.close();
    }
}