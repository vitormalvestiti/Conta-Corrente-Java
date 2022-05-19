class Conta{
	int numero;
	String dono;
	double saldo;
	double limite;

	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

	void deposita(double quantidade){
		this.saldo += quantidade;
	}

	boolean sacar(double valor){
		if (this.saldo < valor){
			return false;
		}else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void transferencia(Conta ContaDestino, double valor){
		this.saldo = this.saldo - valor;
		ContaDestino.saldo = ContaDestino.saldo + valor;
	}
}