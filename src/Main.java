import Model.Aluno;

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
        System.out.println("______________________________________________________");
        System.out.println("______________________________________________________");
        {
            Aluno aluno01 = new Aluno();
            aluno01.nome = "Paulo";
            aluno01.altura = 1.77;
            aluno01.anoMatricula = 2023;

            Aluno aluno02 = new Aluno();
            aluno02.nome = "Marcos";
            aluno02.altura = 1.65;
            aluno02.anoMatricula = 2024;

            Aluno aluno03 = new Aluno();
            aluno03.nome = "Marcia";
            aluno03.altura = 1.58;
            aluno03.anoMatricula = 2022;

            Aluno aluno04 = new Aluno();
            aluno04.nome = "Silvia";
            aluno04.altura = 1.75;
            aluno04.anoMatricula = 2021;

            System.out.println(aluno01.nome + " tem " + aluno01.altura + "m");
            aluno01.estudar();
            System.out.println("---");

            System.out.println(aluno02.nome + " tem " + aluno02.altura + "m");
            aluno02.estudar();
            System.out.println("---");

            System.out.println(aluno03.nome + " tem " + aluno03.altura + "m");
            aluno03.estudar();
            System.out.println("---");

            System.out.println(aluno04.nome + " tem " + aluno04.altura + "m");
            aluno04.estudar();
            System.out.println("---");

        }
    }
}
