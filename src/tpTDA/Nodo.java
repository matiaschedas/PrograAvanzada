package tpTDA;

public class Nodo {
	Object dato;
	Nodo nodoSig;
	
	public Nodo(Object dato,Nodo sig) {
		this.dato = dato;
		nodoSig = sig;
	}
	
	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public Nodo getNodoSig() {
		return nodoSig;
	}

	public void setNodoSig(Nodo nodoSig) {
		this.nodoSig = nodoSig;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", nodoSig=" + nodoSig + "]";
	}
	

	
}
