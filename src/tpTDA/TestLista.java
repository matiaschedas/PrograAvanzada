package tpTDA;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestLista {

	@Test
	public void queAgregaAlFinalyLoSaca() {
		Lista lista = new Lista();
		for(int i=0;i<10;i++) {
			lista.pushBack(i);
		}
		int j=9;
		Object n;
		for(int i=0;i<10;i++) {
			n = lista.popBack();
			assertEquals(j,n);
			j--;	
		}	
	}
	@Test
	public void queAgregaAlPrincipio() {
		Lista lista = new Lista();
		
		for (int i = 0; i < 8; i++) {
			lista.pushBack(i);
		}
		int j=0;
		Object n;
		for(int i=0;i<5;i++){
			n=lista.popBack();
			assertEquals(j,n);
			j++;
		}
	}
		
	
	
	
	
	
	

}
