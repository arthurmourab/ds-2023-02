package anotacao;


public class Main {
	public static void main(String[] args) {
        Moto moto = new Moto();
        
        // Utilização de classe anônima
        verificarENotificarObservador(new ObservadorMoto(), moto);
        
        
        // Utilização de lambda. Nesse caso, como não é possível passar anotações para uma interface implementado por meio de lambda, o observador não consegue observar nenhum objeto.
        verificarENotificarObservadorNovo(() -> {
        	System.out.println("Carro observado!");
        	}, moto);
        }
     
       
        
     
	private static void verificarENotificarObservador(Object observador, Object observado) {
        Class<?> classeObservador = observador.getClass();
        Class<?> classeObservado = observado.getClass();

        if (classeObservador.isAnnotationPresent(Observer.class)) {
            Observer annotation = classeObservador.getAnnotation(Observer.class);

            if (annotation.observado().equals(classeObservado.getSimpleName().toLowerCase())) {
                if (observador instanceof Observador) {
                    ((Observador) observador).update();
                }
            }
            else {
            	System.out.println("O observador não pode observar esse objeto (Identificador incorreto).");
            } 
        }
    }
	
	private static void verificarENotificarObservadorNovo(Runnable observador, Object observado) {
        Class<?> classeObservador = observador.getClass();
        Class<?> classeObservado = observado.getClass();

        if (classeObservador.isAnnotationPresent(Observer.class)) {
            Observer annotation = classeObservador.getAnnotation(Observer.class);

            if (annotation.observado().equals(classeObservado.getSimpleName().toLowerCase())) {
                if (observador instanceof Observador) {
                    ((Observador) observador).update();
                }
            }
            else {
            	System.out.println("O observador não pode observar esse objeto (Identificador incorreto).");
            }
        } else {
        	System.out.println("O observador não pode observar esse objeto (Identificador ausente.)");
        }
        
    }
}
