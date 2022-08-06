package one.dio.gof.strategy;

public class Robo {
	
	private Comportamento comportamento;
	
	public void setComportamneto(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
