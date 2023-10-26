package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SomaColunasCSV {

	public static void main(String[] args) {

		String arquivoEntrada = "nomeDoArquivoDeEntrada.csv";
		String arquivoSaida = "nomeDoArquivoDeSaida.csv";

		try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
				BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))) {
			String linha;

			while ((linha = leitor.readLine()) != null) {
				String[] colunas = linha.split(",");
				double soma = Double.parseDouble(colunas[0]) + Double.parseDouble(colunas[1]);
				escritor.write(linha + "," + soma);
				escritor.newLine();
			}

			System.out.println("Processo conluído. Resultados salvos em " + arquivoSaida);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
