public class ContaBancaria {
    public String name;
    public double balance; // Saldo
    public double saldobancario;

    public void deposito(double amount) {
        balance += amount;
    }
    //Retorno nulo
    public void saquebancario(double amount) {
        if (amount > balance) {
            System.out.println("Saldo Insuficiente");
        }
        else {
            balance -=  amount;
                }
    }

    }

