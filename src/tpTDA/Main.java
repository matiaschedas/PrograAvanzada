package tpTDA;

public class Main {

	public static void main(String[] args) {
		
		ColaDinamica colaTest = new ColaDinamica();
		
		System.out.println("COLA DINAMICA");
		
		for(int i = 0; i < 10 ; i++) {
			
			colaTest.offer(i);
		}
		
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(colaTest.poll());
		}
		
		System.out.println("PILA DINAMICA");
	
		PilaDinamica p = new PilaDinamica();
		
		for(int i = 0 ; i < 10; i++)
			p.push(i);
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println(p.pop());
			}
		
			
	}

}
