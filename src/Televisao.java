public class Televisao extends Produto{

    public Televisao(){
        super("Televisão", 2500.00);
    }

    @Override
    public void exibirInformacoes(){
    System.out.println(getNome() +  " - R$ " + getPreco());
    }

}
