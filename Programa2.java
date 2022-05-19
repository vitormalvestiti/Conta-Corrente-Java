class Programa2{
	public static void main(String[] args){
		//declarando a variavel do tipo conta
		Conta contaCorrente;
		Conta contaPoupanca;
		contaCorrente = new Conta();
		contaPoupanca = new Conta();


		contaCorrente.saldo = 1000;
		contaPoupanca.saldo = 100;

		System.out.println("Saldo Poupanca: " + contaPoupanca.saldo);
		System.out.println("Saldo Conta Corrente: " + contaCorrente.saldo);
		/*
		double valorSaque = 200;
		if(contaCorrente.sacar(valorSaque)){
			System.out.println("Saque efetuado");
		}else{
			System.out.println("Saldo conta corrente insuficiente");
		}
		System.out.println("Saldo Conta Corrente apos o saque: " + contaCorrente.saldo);	

		if(contaPoupanca.sacar(valorSaque)){
			System.out.println("Saque efetuado");
		}else{
			System.out.println("Saldo poupanca insuficiente");
		}
		System.out.println("Saldo Poupanca apos o saque: " + contaPoupanca.saldo);	
		*/
		
		contaCorrente.transferencia(contaPoupanca, 10);

		System.out.println("Saldo Poupanca: " + contaPoupanca.saldo);
		System.out.println("Saldo Conta Corrente: " + contaCorrente.saldo);
	
	}
}