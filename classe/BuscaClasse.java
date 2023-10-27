package classe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuscaClasse {
	
    public static List<String> buscarArquivosDeClasse(String caminhoDir, String nomeClasse, boolean usarStreamParalela)
            throws IOException {
        String caminho = "C:/Users/Arthur/eclipse-workspace/classe/src/classe" + caminhoDir;

        Stream<Path> fluxoArquivos = Files.walk(Path.of(caminho));

        if (usarStreamParalela) {
            fluxoArquivos = fluxoArquivos.parallel();
        }

        List<String> resultado = fluxoArquivos
                .filter(arquivo -> arquivo.toString().matches(".+\\.(java|jar|war)"))
                .filter(arquivo -> {
                    if (arquivo.toString().endsWith(".java")) {
                        return arquivo.getFileName().toString().equals(nomeClasse + ".java");
                    } else {
                        try {
                            return Files.readString(arquivo).contains(nomeClasse);
                        } catch (IOException e) {
                            return false;
                        }
                    }
                })
                .map(Path::toString)
                .collect(Collectors.toList());

        return resultado;
    }

    public static Boolean buscar(String[] argumentos) {
        String caminhoDir;
        String nomeClasse;
        boolean usarStreamParalela = false;

        if (argumentos != null && argumentos.length >= 2) {
            caminhoDir = argumentos[0];
            nomeClasse = argumentos[1];
            usarStreamParalela = argumentos.length > 2 && (argumentos[2].equals("-paralelo") || argumentos[2].equals("-p"));
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o caminho do diretório: ");
            caminhoDir = scanner.nextLine();

            System.out.println("Digite o nome da classe: ");
            nomeClasse = scanner.nextLine();

            System.out.println("Usar a opção -paralelo (sim/não)? ");
            usarStreamParalela = scanner.nextLine().toLowerCase().startsWith("s");

            scanner.close();
        }

        long tempoInicio = System.nanoTime();

        try {
            List<String> arquivosClasse = buscarArquivosDeClasse(caminhoDir, nomeClasse, usarStreamParalela);

            long tempoFim = System.nanoTime();
            long tempoDecorrido = TimeUnit.NANOSECONDS.toMillis(tempoFim - tempoInicio);

            if (arquivosClasse.isEmpty()) {
                System.out.println("Classe não encontrada.");
                return false;
            } else {
                System.out.println("Classe encontrada em:");
                arquivosClasse.forEach(System.out::println);
            }
            System.out.println("Tempo gasto: " + tempoDecorrido + " milissegundos");
            System.out.println("Total de arquivos .java consultados: " + arquivosClasse.size());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
