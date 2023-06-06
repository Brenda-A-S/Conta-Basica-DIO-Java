import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Importar a classe scanner        
        Scanner scan = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        //Obter os valores pelo scanner e definir as váriaveis
        System.out.println("Por favor, digite o numero da conta !");
        String numeroConta = scan.next();
        System.out.println("Por favor, digite o numero da Agencia !");
        String agencia = scan.next();
        System.out.println("Por favor, digite o seu nome !");
        String nome = scan.next();
        System.out.println("Por favor, digite o seu saldo !");
        String saldo = scan.next();

        scan.close();
        //Exibir a mensagem conta criada
        System.out.println("Ola "+ nome +", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque!");
    }
}
