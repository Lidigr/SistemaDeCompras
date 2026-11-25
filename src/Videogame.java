public class Videogame extends Produto{

    public Videogame(){
        super("Videogame", 3500.00);
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getNome() + " - R$ " + getPreco());
    }
}
