//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            Produto produtos = new Produto();

            produtos.nome = "Placa-mãe";
            produtos.quantidade = 37;
            produtos.preco = 780.99;

            produtos.AdicionarProduto(10);
            produtos.VenderProduto(37);
            produtos.VenderProduto(57);

        }
        System.out.println("______________________________________________________");
        System.out.println("______________________________________________________");
        {
            alunos Aluno1 = new alunos();

            Aluno1.nome = "Joana";
            Aluno1.nota1 = 9.6;
            Aluno1.nota2 = 7.3;


            alunos Aluno2 = new alunos();

            Aluno2.nome = "Silvia";
            Aluno2.nota1 = 6.6;
            Aluno2.nota2 = 8.9;

            System.out.println(Aluno1.nome + " tem média " + Aluno1.calculateAverage());
            System.out.println(Aluno2.nome + " tem média " + Aluno2.calculateAverage());

        }
        System.out.println("______________________________________________________");
        System.out.println("______________________________________________________");
        {
            Bond bond = new Bond();
            bond.name = "Tesouro Selic";
            bond.balance = 1000.00;

            bond.buyBond(24); // Compra um título com prazo de 24 meses
            bond.simulateInterest(); // Simula os juros por 24 meses
        }


    }
}
