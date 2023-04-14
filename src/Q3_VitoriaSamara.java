import java.util.Scanner;

public class Q3_VitoriaSamara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = input.nextInt();

        int soma = n;
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            int num = input.nextInt();

            soma += num;
        }

        System.out.printf("A soma dos %d números e o próprio %d é: %d", n, n, soma);

        input.close();
    }
}
