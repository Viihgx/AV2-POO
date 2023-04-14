import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q5_VitoriaSamara {

    public static void main(String[] args) {
        String arquivo = "C:\\Users\\vitor\\OneDrive\\Documentos\\Teste.txt";
        List<String> palavrasComLink = buscarPalavrasComLink(arquivo);
        for (String palavra : palavrasComLink) {
            System.out.println(palavra);
        }
    }
    public static List<String> buscarPalavrasComLink(String caminhoArquivo) {
        List<String> palavrasComLink = new ArrayList<String>();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
            String linha = null;
            while ((linha = leitor.readLine()) != null) {
                String[] palavras = linha.split("\\s+");
                for (String palavra : palavras) {
                    if (palavra.contains("link")) {
                        palavrasComLink.add(palavra.replaceAll("[^a-zA-Z0-9]", ""));
                    }
                }
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palavrasComLink;
    }
}
