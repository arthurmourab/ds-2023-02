import java.util.Comparator;

public class ComparadorEstudante {
    public static Comparator<Estudante> compararPorSobrenome = Comparator.comparing(Estudante::getSobrenome);
    public static Comparator<Estudante> compararPorIdade = Comparator.comparing(Estudante::getIdade);
    public static Comparator<Estudante> compararPorMedia = Comparator.comparing(Estudante::getMedia);
}
