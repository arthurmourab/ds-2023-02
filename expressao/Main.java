
public class Main {
    public static void main(String[] args) {
        float resultado  =  new Soma(new Constante(5),new Multiplica(new Constante(2), new Constante(3))).valor();
        System.out.println(resultado);
    }
}