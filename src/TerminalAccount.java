import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    //Criação da Classe Principal
    public static void main(String[] args)  throws Exception {
        //criação do scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Caro cliente, digite o seu nome:");
        String clientName = scanner.nextLine();

        System.out.println(clientName + ", digite o número da sua conta:");
        int accountNumber = scanner.nextInt();

        System.out.println(clientName + ", por favor digite o número da sua agência:");
        String agencyNumber = scanner.next();

        System.out.println(clientName + ", digite o seu saldo");
        double balance = scanner.nextDouble();

        //Mensagem final com os dados do usuário
        System.out.println("Olá " + clientName + "! Obrigado por criar uma conta em nosso banco, sua agência é: " + agencyNumber + ", conta: " + accountNumber + " e seu saldo de: " + balance + " já está disponível para saque!");

        scanner.close();
    }
}
