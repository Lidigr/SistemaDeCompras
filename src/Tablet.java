public class Tablet extends Produto{

    public Tablet(){
        super("Tablet",1200.00);
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getNome() + " - R$ " + getPreco());
    }
}
