package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		primeiraConta.saldo += 100;
		segundaConta.saldo += 50;
		
		System.out.println("O saldo da primeira conta � " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta � " + segundaConta.saldo);

	}

}
