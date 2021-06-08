package interpreter;

public class Numero implements Operador{
	private int numero;
	
	public Numero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int intepretador() {
		return this.numero;
	}
}
