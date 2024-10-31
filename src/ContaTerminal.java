import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Insira o número: ");
        numero = scanner.nextInt();

        System.out.println("Insira a agência: ");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Insira o nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Insira o saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}