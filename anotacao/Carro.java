package anotacao;

@Observer(observado = "carro")
class Carro  {
    public void realizarAcao() {
        System.out.println("Ação realizada pelo Carro!");
    }  
}
