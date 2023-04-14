import java.util.Scanner;

public class Q4_VitoriaSamara {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String str = sc.nextLine();

        String[] tokens = str.split("\\s+");

        System.out.println("Tokens que começam com a letra 's':");
        for (String token : tokens) {
            if (token.charAt(0) == 's' || token.charAt(0) == 'S') {
                System.out.println(token);
            }
        }

        sc.close();
    }
}
