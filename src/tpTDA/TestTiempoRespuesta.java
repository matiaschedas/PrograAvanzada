package tpTDA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTiempoRespuesta {

	@Test
	public void cualEsMasRapidoPila() {
		PilaEstatica pilaE = new PilaEstatica(1000000);
		PilaDinamica pilaD = new PilaDinamica();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			pilaE.push(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			pilaD.push(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2 - startTime2);
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
		System.out.println(endTime - startTime);

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			colaD.offer(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2 - startTime2);
	}
	
	//Conclusion:
	
}
