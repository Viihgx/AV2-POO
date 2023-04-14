import java.util.Scanner;

public class Q1_VitoriaSamara {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro inteiro:");
        int primeiro = sc.nextInt();
        
        System.out.println("Digite o segundo inteiro:");
        int segundo = sc.nextInt();
        
        int soma = primeiro + segundo;
        
        System.out.println("A soma dos inteiros é: " + soma);
        
        sc.close();
    }
}
