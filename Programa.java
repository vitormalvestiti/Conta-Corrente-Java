class Programa{
	public static void main(String[] args){
		//declarando a variavel do tipo conta
		Conta minhaConta;
		minhaConta = new Conta();

		//criando a variavel para o objeto conta
		minhaConta.dono = "Jonas";
		minhaConta.saldo = 500.00;

		//exibindo o saldo da conta
		System.out.println("Nome do cliente: " + minhaConta.dono);
		System.out.println("Saldo da conta: " + minhaConta.saldo);

		//efetuando saque
		double valorSaque = 500;
		//minhaConta.saca(700);
		if(minhaConta.sacar(valorSaque)){
			System.out.println("Saque efetuado");
		}else{
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Saldo apos o saque: " + minhaConta.saldo);	

		minhaConta.deposita(100);
		System.out.println("Saldo apos o deposito: " + minhaConta.saldo);
		
		
	}
}