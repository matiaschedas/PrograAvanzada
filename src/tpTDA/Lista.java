package tpTDA;

public class Lista {
	
	private Nodo nodo;
	private PilaCL pila;
	private ColaCL cola;
	
	public ColaCL getCola() {
		return cola;
	}

	public void setCola(ColaCL cola) {
		this.cola = cola;
	}

	public PilaCL getPila() {
		return pila;
	}

	public void setPila(PilaCL pila) {
		this.pila = pila;
	}

	public Lista() {
		nodo=null;
	}
	
	public boolean pushBack(Object dato) {//inserta un elemento al final 
		Nodo nue;
		Nodo aux;
		try {
			nue = new Nodo(dato,null);			
		}catch (Exception e) { return false;}
		aux=nodo;
		while(aux!=null && aux.getNodoSig()!=null) {
			aux=aux.getNodoSig();
		}
		if(aux==null) nodo=nue;
		else aux.setNodoSig(nue);
		return true;
	}
	
	public Object popBack() {	//retorna y borra el elemento final
		Nodo nae, anterior;
		Object dato;
		
		if(nodo==null)
			return null;
		nae=anterior=nodo;
		
		while(nae!=null && nae.getNodoSig() != null) {
			anterior=nae;
			nae = nae.getNodoSig();
		}
		
		dato = nae.getDato();
		anterior.setNodoSig(null);
		return dato;
	}
	
	public boolean pushFront(Object dato) {//inserta un elemento al comienzo
		Nodo nue, sig;
		try {
			nue = new Nodo(dato,null);
		} catch (Exception e) {
				return false;
		}
		sig=nodo;
		nue.setNodoSig(sig);
		nodo=nue;
		return true;
	}
	
	public Object popFront() {//retorna y borra el elemento del principio
		Nodo nae;
		Object dato;
		
		nae=nodo;
		if(nae==null) return null;
		
		dato = nae.getDato();
		nae = nae.getNodoSig();
		nae = null;
		return dato;
	}
	
	public Object remove(Object dato) {//elimina un elemento de valor determinado
		Nodo nae, anterior;
		Object datoRes;
		
		nae=anterior=nodo;
		while(nae!=null && nae.getDato()!=dato) {
			anterior=nae;
			nae = nae.getNodoSig();
		}
		if(nae != null && anterior==nae && nae.getDato()==dato){
			nodo=nae.getNodoSig();
			datoRes = nae.getDato();
			anterior.setNodoSig(nae.getNodoSig());
			return datoRes;
		}
		else if(nae != null && nae.getDato()==dato) {
			anterior.setNodoSig(nae.getNodoSig());
			nae.setNodoSig(null);
			datoRes = nae.getDato();
			return datoRes;
		}
		return null;
	}
	
	public void recorreYlista() {
		Nodo aux;
		aux=nodo;
		while(aux != null) {
			System.out.println(aux.getDato());
			aux=aux.getNodoSig();
		}
	}
	public boolean reverse() {//invierte el orden de los elementos en la lista
		Nodo pri, fin;
		int delta=this.size();
		int i=1;
		int cont=0;
		Object dato;
		boolean flag=false;
		
		if(nodo==null)
			return false;
		//se deberia hacer con intercambio de "punteros".
		pri=nodo;
		fin=null;
		while(pri!=fin && !flag) {
			fin=nodo;
			
			while(fin.getNodoSig()!=null && cont<delta-i) {
				cont++;
				fin=fin.getNodoSig();
			}
			dato=pri.getDato();
			pri.setDato(fin.getDato());
			fin.setDato(dato);
			i++;
			cont=0;
			pri=pri.getNodoSig();
			if(fin.getNodoSig()==pri)
				flag=true;
		}	
		return true;
	}
	public boolean insertAt(int pos , Object dato) {//inserta dato en la pos indicada
		Nodo nue,aux;
		try {
			nue = new Nodo(dato,null);
		}
		catch (Exception e) {return false;}
		aux=nodo;
		if(pos==0) {
			nue.setNodoSig(nodo);
			nodo=nue;
		}
		while(aux!=null && pos>1){
			pos--;
			aux=aux.getNodoSig();
		}
		if(pos==1) {
		nue.setNodoSig(aux.getNodoSig());
		aux.setNodoSig(nue);
		}
		return true;
	}
	
	public Object eraseAt(int pos){//elimina pos
		Nodo nae, anterior;
		Object datoRes;
		
		nae=anterior=nodo;
		while(nae != null && pos>0) {
			pos--;
			anterior=nae;
			nae = nae.getNodoSig();
		}
		if(anterior==nae){
			datoRes = nae.getDato();
			nodo=nae.getNodoSig();
			nae=null;
		}
		else if(nae != null && pos==0) {
			datoRes = nae.getDato();
			anterior.setNodoSig(nae.getNodoSig());
			nae = null;
			return datoRes;
		}
		return null;
	}
	
	public boolean isEmpty() {//verifica si esta vacia
		if(nodo==null)
			return true;
		return false;
	}
	public void empty() {//vacia la lista
		Nodo aux, ant;
		aux=nodo;
		while(aux != null && aux.getNodoSig() != null) {
			ant=aux;
			aux=aux.getNodoSig();
			ant=null;
			nodo=aux;
		}
		nodo=null;
	}
	public Object search(Object dato) {//busca por dato
		Nodo recorre=nodo;
		while(recorre!=null && recorre.getDato()!=dato) {
			recorre=recorre.getNodoSig();
		}
		if(recorre!=null && recorre.getDato()==dato) {
			return recorre.getDato();
		}
		return null;
	}
	public Object searchAt(int pos) {//busca por posicion
		Nodo bus;
		if(nodo==null)
			return null;
		bus=nodo;
		while(bus!=null && pos>0) {
			pos--;
			bus=bus.getNodoSig();
		}
		if(pos==0)
			return bus.getDato();
		return null;
	}
	
	public int size() {//retorna numero de elementos en una lista
		Nodo aux;
		int res=0;
		aux=nodo;
		while(aux != null) {
			aux=aux.getNodoSig();
			res++;
		}
		return res;
	}
}
