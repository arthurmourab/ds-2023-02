public class Main {
    public static void main(String[] args) {
        RaizQuadradaNewton raizQuadradaNewton = new RaizQuadradaNewton();

        // Exemplo de uso
        double resultado = raizQuadradaNewton.apply(16.0);
        System.out.println("Raiz quadrada de 16: " + resultado);
    }
}