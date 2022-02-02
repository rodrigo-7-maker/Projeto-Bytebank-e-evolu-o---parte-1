package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.saldo = 100;
		contaDoRodrigo.deposita(50);
		System.out.println(contaDoRodrigo.saldo);
		
		boolean conseguiuRetirar = contaDoRodrigo.saca(20);
		System.out.println(contaDoRodrigo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta ContaDaMarcela = new Conta();
		ContaDaMarcela.saldo = 1000;
		
		boolean transferencia = ContaDaMarcela.transfere(300, contaDoRodrigo);
		System.out.println(ContaDaMarcela.saldo);
		System.out.println(contaDoRodrigo.saldo);
		System.out.println(transferencia);
	}

}
