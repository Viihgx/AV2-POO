import java.util.Scanner;

public class Q2_VitoriaSamara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a quantidade de numeros: ");
            n = input.nextInt();
        } while (n <= 0);

        int soma = 0;

        int i = 1;
        do {
            System.out.printf("Digite o %dº número: ", i);
            int num = input.nextInt();

            soma += num;
            i++;
        } while (i <= n);

        System.out.printf("A soma dos %d numeros e: %d", n, soma);

        input.close();
    }
}
