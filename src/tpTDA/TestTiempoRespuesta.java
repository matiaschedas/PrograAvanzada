package tpTDA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTiempoRespuesta {

	@Test
	public void cualEsMasRapidoPila() {
		PilaEstatica pilaE = new PilaEstatica();
		PilaDinamica pilaD = new PilaDinamica();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			pilaE.push(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("pila est " + (endTime - startTime));

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			pilaD.push(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("pila din " + (endTime2 - startTime2));
	}

	@Test
	public void cualEsMasRapidoCola() {
		ColaEstatica colaE = new ColaEstatica(1000000);
		ColaDinamica colaD = new ColaDinamica();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			colaE.offer(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("cola est "+ (endTime - startTime));

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			colaD.offer(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("cola din " + (endTime2 - startTime2));
	}
	
	// Conclusion: las estaticas tardan menos ya que reservan memoria desde un principio, mientras que 
				// la dinamica reserva a medida que necesita.
		// 
		// ejemplo de polimorfismo: pilas: creamos dos pilas una estatica y una dinamica y 
		// utilizamos el metodo push que para cada pila desarrolla un codigo distinto a pesar de que 
		// ambas heredan el mismo metodo de la interfaz.(lo mismo para cola).
		
}
