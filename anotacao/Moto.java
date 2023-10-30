package anotacao;

@Observer(observado = "moto")
class Moto  {
    public void realizarAcao() {
        System.out.println("Ação realizada pela Moto!");
    }
}
