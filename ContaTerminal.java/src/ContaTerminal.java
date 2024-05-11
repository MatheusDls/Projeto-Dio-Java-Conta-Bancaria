import java.util.Locale;
import java.util.Scanner;
import static java.util.stream.LongStream.concat;

public class ContaTerminal {
    public static void main (String [] args) throws Exception{
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Por favor,digite o número da sua Conta :");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor,digite o número da sua Agencia :");
        String agencia = scanner.nextLine();

        System.out.println("Por favor,digite seu nome :");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor,digite o valor para saque :");
        double saque = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta é " + conta + ", e seu saldo de " + saque + " já está disponível para saque.");


    }

}
