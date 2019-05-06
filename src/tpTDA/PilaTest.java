package tpTDA;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;


public class PilaTest {
	PilaEstatica pilaE = new PilaEstatica();
	PilaDinamica pilaD = new PilaDinamica();
	@After
	public void vaciarPilas() {
		pilaE.empty();
		pilaD.empty();
	}
	@Test
	public void queApilaYDesapilaEstatica() {
		int i;
		for(i =0; i<5;i++) {
			pilaE.push(i);
		}
		for(i=4;i>=0;i--) {
			assertEquals(i, pilaE.pop());
		}
	}
	@Test
	public void queRecuperaTopeEstatica() {
		int i;
		for(i =0; i<5;i++) {
			pilaE.push(i);
		}
		assertEquals(4,pilaE.peek());
	}
	@Test
	public void queRevisaVaciaEstatica() {
		assertEquals(true,pilaE.isEmpty());
	}
	@Test
	public void queApilaYDesapilaDinamica() {
		int i;
		for(i =0; i<5;i++) {
			pilaD.push(i);
		}
		for(i=4;i>=0;i--) {
			assertEquals(i, pilaD.pop());
		}
	}
	@Test
	public void queRecuperaTopeDinamica() {
		int i;
		for(i =0; i<5;i++) {
			pilaD.push(i);
		}
		assertEquals(4,pilaD.peek());
	}
	@Test
	public void queRevisaVaciaDinamica() {
		assertEquals(true,pilaD.isEmpty());
	}
	
}
