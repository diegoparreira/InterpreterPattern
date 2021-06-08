package interpreter;

public class DivisaoInteira implements Operador{
	private Operador esquerda;
	private Operador direita;
	
	public DivisaoInteira(Operador inEsquerda, Operador inDireita) {
		this.esquerda = inEsquerda;
		this.direita  = inDireita;
	}
	
	@Override
	public int intepretador() {
		return this.esquerda.intepretador() % this.direita.intepretador();
	}
}
