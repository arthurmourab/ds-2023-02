import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudante> listaEstudantes = new ArrayList<>();

        // Criando estudantes para serem ordenados
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Estudante estudante3 = new Estudante();

        // Definindo nomes para os estudantes (comparação principal)
        estudante1.setNome("Silvio");
        estudante2.setNome("Arthur");
        estudante3.setNome("Laércio");

        // Definindo sobrenome para os estudantes (comparação por String)
        estudante1.setSobrenome("Santos");
        estudante2.setSobrenome("Moura");
        estudante3.setSobrenome("Alves");

        // Definindo idade para os estudandes (comparação por int)
        estudante1.setIdade(5);
        estudante2.setIdade(4);
        estudante3.setIdade(6);

        //Definindo medias para os estudantes (comparação por double)
        estudante1.setMedia(5.5);
        estudante2.setMedia(4.4);
        estudante3.setMedia(6.6);

        // Adicionando estudantes na lista
        listaEstudantes.add(estudante1);
        listaEstudantes.add(estudante2);
        listaEstudantes.add(estudante3);

        // Chamando método principal de ordenação
        Collections.sort(listaEstudantes);

        // Outros métodos de ordenação
        //Collections.sort(listaEstudantes, ComparadorEstudante.compararPorSobrenome);
        //Collections.sort(listaEstudantes, ComparadorEstudante.compararPorIdade);
        //Collections.sort(listaEstudantes, ComparadorEstudante.compararPorMedia);

        // Exibindo estudantes
        for (Estudante estudante : listaEstudantes) {
            System.out.println(estudante.getNome() + " " + estudante.getSobrenome());
            System.out.println("Idade: " + estudante.getIdade());
            System.out.println("Media: " + estudante.getMedia());
            System.out.println();
        }
    }
}
