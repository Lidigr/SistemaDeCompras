public class Celular extends Produto{

    public Celular(){
        super("Celuar", 1800.00);
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getNome() + " - R$ " + getPreco());
    }
}
