package tpTDA;

public class PilaEstatica implements Pila {

	private int tope;
	private Object vector[];	
	
	public PilaEstatica() {
		this.vector = new Object[2];
		this.tope=-1;
	}
	
	public static Object[] resizeArray(int resize, Object[] a) {

	    Object[] b = new Object[resize];

	    /* 1ºArg: Array origen,
	     * 2ºArg: Por donde comienza a copiar en el origen
	     * 3ºArg: Array destino
	     * 4ºArg: Por donde comienza a copiar en el destino
	     * 5ºArg: Numero de elementos que copiara del origen
	     */
	    System.arraycopy(a, 0, b, 0, a.length);
	    return b;
	}
	
	@Override
	public boolean push(Object dato) {
		if((tope+1)<vector.length)
			this.vector[++tope] = dato;
		else {
			try {
			vector= resizeArray(vector.length*2,vector);
			}
			 catch (Exception e) {
				return false;
			}
			this.vector[++tope] = dato;
		}
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
