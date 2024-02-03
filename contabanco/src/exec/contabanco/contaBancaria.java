package exec.contabanco;
import java.util.Scanner;

public class contaBancaria {

	public class contaTerminal {
	
		public static void main(String[] args) {
			int numeroConta;
			int numeroAgencia;
			String nomeCompleto;
			float saldoAtual;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o numero de conta");
			numeroConta = scan.nextInt();
			System.out.println("Digite o nº sua agência");
			numeroAgencia = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Digite o seu nome completo");
			nomeCompleto = scan.nextLine();
			
			System.out.println("Digite o seu saldo atual");
			saldoAtual = scan.nextFloat();
			
			System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta no nosso banco, sua Agência  " + numeroAgencia + " conta " + numeroConta + " e seu saldo R$" + saldoAtual + " já está disponivel para saque.");
			scan.close();
			}
	}
}
