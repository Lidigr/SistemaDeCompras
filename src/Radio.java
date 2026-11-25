public class Radio extends Produto{

    public Radio(){
        super("Radio", 250.00);

    }
    @Override
    public void exibirInformacoes(){
        System.out.println(getNome() + " - R$ " + getPreco()    );
    }
}
