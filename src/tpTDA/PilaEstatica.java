package tpTDA;

public class PilaEstatica implements Pila {

	private static int tam=1000;
	private int capacidad;
	private int tope=-1;
	private Object vector[];	
	
	public PilaEstatica() {
		this.capacidad=tam;
		this.vector = new Object[capacidad];
	}
	public PilaEstatica(int tam) {		
		this.capacidad = tam;
		this.vector = new Object [capacidad];
	}
	
	@Override
	public boolean push(Object dato) {
		if(tope<capacidad)
			this.vector[++tope] = dato;
		else return false;
		
		return true;
	}

	@Override
	public Object pop() {
		if(tope==-1)
		return null;
		return vector[tope--];
	}

	@Override
	public Object peek() {
		if(tope==-1)
			return null;
		return vector [tope];
	}

	@Override
	public boolean isEmpty() {
		if(tope==-1)
		return true;
		return false;
	}

	@Override
	public void empty() {
		this.tope=-1;		
	}

}
