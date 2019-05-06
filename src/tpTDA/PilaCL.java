package tpTDA;

public class PilaCL implements Pila{
	Nodo nodo;	

	public void Pila() {
		nodo = null;
	}
	@Override
	public boolean push(Object dato) {
		Nodo nuevo;
		
		try {			
			nuevo = new Nodo(dato,nodo);
		}catch (Exception e) {
			return false;
		}
		nodo = nuevo;
		return true;
	}

	@Override
	public Object pop() {
		Nodo nae;
		if(nodo!=null) {
			nae=nodo;
			nodo = nae.getNodoSig();
			return nae.getDato();
		}
		return null;
	}

	@Override
	public Object peek() {
		if(nodo!=null)
			return nodo.getDato();
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(nodo == null)
			return true;
		return false;
	}

	@Override
	public void empty() {
		nodo = null;

	}

}

