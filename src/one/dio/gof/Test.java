package one.dio.gof;

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoNormal;
import one.dio.gof.strategy.Robo;

public class Test {
	 // Singleton 
	
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamneto(normal);
		robo.mover();
		robo.mover();
		robo.setComportamneto(agressivo);
		robo.mover();
		robo.mover();
		robo.setComportamneto(defensivo);
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente ("Jéssica", "161993");
		
	}

}
