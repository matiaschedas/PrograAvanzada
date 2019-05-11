package tpTDA;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestLista {

	Lista lista = new Lista();
	int i;
	
	@Before
	public void vaciaLista() {
		lista.empty();
	}
	@Test
	public void queAgregaAlFinalyLoSaca() {
		for(i=0;i<10;i++) {
			lista.pushBack(i);
		}
		int j=9;
		Object n;
		for(i=0;i<10;i++) {
			n = lista.popBack();
			assertEquals(j,n);
			j--;	
		}	
	}
	@Test
	public void queAgregaAlPrincipio() {
		for (i = 0; i < 8; i++) {
			lista.pushBack(i);
		}
		int j=7;
		Object n;
		for(i=0;i<8;i++){
			n=lista.popBack();
			assertEquals(j,n);
			j--;
		}
	}
	@Test
	public void queVoltea(){
		for (i=0; i < 8; i++) {
			lista.pushBack(i);
		}
		lista.reverse();
		int j=0;
		for(i=0;i<8;i++) {
			assertEquals(j,lista.popBack());
			j++;
		}
	}
	@Test
	public void queInsertaEnPosInvalida() {
		for (i = 0; i < 7; i++) {
			lista.pushFront(i);
		}
		lista.insertAt(-1, 10);
		assertEquals(null,lista.getNodo(-1));
	}
	@Test
	public void queInsertaEnPosValida() {
		for (i = 0; i < 7; i++) {
			lista.pushFront(i);
		}
		lista.insertAt(3, 10);
		assertEquals(10,lista.searchAt(3));
	}
	@Test
	public void queBuscaDato() {
		for (i=0; i < 8; i++) {
			lista.pushBack(i);
		}
		for(int j=0;j<8;j++) {
			assertEquals(j,lista.search(j));
		}
	}
	@Test
    public void queEliminaPos() {
        for (i = 0; i < 7; i++) {
            lista.pushBack(i);
        }
        for(int j=0; j<7;j++) {
        	lista.eraseAt(0);
        	assertEquals(null,lista.search(j));
        }
    }
	
	
}
