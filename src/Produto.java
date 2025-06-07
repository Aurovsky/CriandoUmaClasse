public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    // Método para adicionar ao estoque

    public void AdicionarProduto(int novoProduto) {

        quantidade += novoProduto;
    }
    public void VenderProduto(int vendaDeProduto) {

        if (vendaDeProduto > quantidade) {
            System.out.println("Estoque Insuficiente!!!  Estoque Atual: " + quantidade);
        } else {
            quantidade -= vendaDeProduto;
            System.out.println(vendaDeProduto + " unidades vendidas. Estoque Restante: " + quantidade);
        }
    }
}

