package tpTDA;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class ColaTest {

	ColaEstatica colaE = new ColaEstatica();
	ColaDinamica colaD = new ColaDinamica();
	@After
	public void vaciarColas() {
		colaD.empty();
		colaE.empty();
	}
	@Test
	public void queAcolaYDesacolaEstatica() {
		int i;
		for(i=0;i<5;i++) {
			colaE.offer(i);
		}
		for(i=0;i<5;i++) {
			assertEquals(i,colaE.poll());
		}
	}
	@Test
	public void queRecuperaPrimeroEstatica() {
		int i;
		for(i=0;i<5;i++) {
			colaE.offer(i);
		}
		assertEquals(0,colaE.peek());
		}
	@Test
	public void queRevisaVaciaEstatica() {
		assertEquals(true, colaE.isEmpty());
	}
	@Test
	public void queAcolaYDesacolaDinamica() {
		int i;
		for(i=0;i<5;i++) {
			colaD.offer(i);
		}
		for(i=0;i<5;i++) {
			assertEquals(i,colaD.poll());
		}
	}
	@Test
	public void queRecuperaPrimeroDinamica() {
		int i;
		for(i=0;i<5;i++) {
			colaD.offer(i);
		}
		assertEquals(0,colaD.peek());
	}
	@Test
	public void queRevisaVaciaDinamica() {
		assertEquals(true, colaD.isEmpty());
	}

}
