public class Bond {
    public String name;
    public double balance;
    public double rate;

    public int term;
    public int monthsRemaing;

    public void buyBond(int newterm) {
        this.term = newterm;
        this.monthsRemaing = newterm;

        if (term > 0 && term < 12) {
            rate = 0.005;
        } else if (term >= 12 && term < 24) {
            rate = 0.010;
        } else if (term >= 24 && term < 36) {
            rate = 0.015;
        } else if (term >= 36 && term < 48) {
            rate = 0.020;
        } else if (term >= 48 && term < 60) {
            rate = 0.025;
        } else {
            System.out.println("Prazo Inválido");
            term = 0;
            rate = 0.0;
        }
    }

    // Método para simular os ganhos dos juros
    public void simulateInterest() {
        while (monthsRemaing > 0) {
            balance += balance * rate / 12;
            monthsRemaing--;
            System.out.println("Saldo: $" + balance + " | meses Restantes: " + monthsRemaing);
        }
        System.out.println("Título vencido!");
    }
}
