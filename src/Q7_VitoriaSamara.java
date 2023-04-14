import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7_VitoriaSamara {

    public static int somaNumeros(String nomeArquivo) throws IOException {
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha;
        int soma = 0;
        while ((linha = br.readLine()) != null) {
            soma += Integer.parseInt(linha);
        }
        br.close();
        return soma;
    }

    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\vitor\\OneDrive\\Documentos\\Numeros.txt";
        try {
            int soma = somaNumeros(nomeArquivo);
            System.out.println("A soma dos numeros no arquivo " + nomeArquivo + " eh: " + soma);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
