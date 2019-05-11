package tpTDA;

public class Lista {
	
	private Nodo pri;
	private Nodo ult;
	
	public Lista() {
		pri=ult=null;
	}
	
	public boolean pushBack(Object dato) {//inserta un elemento al final 
		Nodo nue;
		Nodo aux;
		try {
			nue = new Nodo(dato,null);			
		}catch (Exception e) { return false;}
		aux=ult;
		if(aux==null) pri=ult=nue;
		else { aux.setNodoSig(nue);
		ult = nue;
		}
		return true;
	}
	
	public Nodo getNodo(int pos) {
		Nodo aux=pri;
		while(aux!=null && pos>0) {
			aux=aux.getNodoSig();
			pos--;
		}
		if(pos==0) return aux;
		return null;
	}
	
	public Object popBack() {	//retorna y borra el elemento final
		Nodo nae, anterior;
		Object dato;
		if(pri==null)
			return null;
		anterior=pri;
		int pos = this.size()-2;
		while(anterior.getNodoSig()!= null && pos>0) {
			anterior=anterior.getNodoSig();
			pos--;
		}
		nae=ult;
		dato = nae.getDato();
		anterior.setNodoSig(null);
		ult=anterior;
		return dato;
	}
	
	public boolean pushFront(Object dato) {//inserta un elemento al comienzo
		Nodo nue;
		try {
			nue = new Nodo(dato,pri);
		} catch (Exception e) {
				return false;
		}
		pri=nue;
		return true;
	}
	
	public Object popFront() {//retorna y borra el elemento del principio
		Object dato;
		if(pri==null) return null;
		
		dato = pri.getDato();
		pri = pri.getNodoSig();
		return dato;
	}
	
	public Object remove(Object dato) {//elimina un elemento de valor determinado
		Nodo nae, anterior;
		Object datoRes;
		nae=anterior=pri;
		while(nae!=null && nae.getDato()!=dato) {
			anterior=nae;
			nae = nae.getNodoSig();
		}
		if(nae != null && anterior==nae && nae.getDato()==dato){
			pri=nae.getNodoSig();
			datoRes = nae.getDato();
			nae=null;
			return datoRes;
		}
		else if(nae != null && nae.getDato()==dato) {
			anterior.setNodoSig(nae.getNodoSig());
			datoRes = nae.getDato();
			nae=null;
			return datoRes;
		}
		return null;
	}
	
	public void recorreYlista() {
		Nodo aux;
		aux=pri;
		while(aux != null) {
			System.out.println(aux.getDato());
			aux=aux.getNodoSig();
		}
	}
	public boolean reverse() {//invierte el orden de los elementos en la lista
		Nodo ini, fin;
		int delta=this.size();
		int i=1;
		int cont=0;
		Object dato;
		boolean flag=false;
		if(pri==null)
			return false;
		ini=pri;
		fin=null;
		while(ini!=fin && !flag) {
			fin=pri;	
			while(fin.getNodoSig()!=null && cont<delta-i) {
				cont++;
				fin=fin.getNodoSig();
			}
			dato=ini.getDato();
			ini.setDato(fin.getDato());
			fin.setDato(dato);
			i++;
			cont=0;
			ini=ini.getNodoSig();
			if(fin.getNodoSig()==ini)
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
		aux=pri;
		if(pos==0) {
			nue.setNodoSig(pri);
			pri=nue;
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
		
		nae=anterior=pri;
		while(nae != null && pos>0) {
			pos--;
			anterior=nae;
			nae = nae.getNodoSig();
		}
		if(anterior==nae){
			datoRes = nae.getDato();
			pri=nae.getNodoSig();
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
		if(pri==null)
			return true;
		return false;
	}
	public void empty() {//vacia la lista
		Nodo aux;
		aux=pri;
		while(aux != null && aux.getNodoSig() != null) {
			aux=aux.getNodoSig();
			pri=aux;
		}
		pri=ult=null;
	}
	public Object search(Object dato) {//busca por dato
		Nodo recorre=pri;
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
		if(pri==null)
			return null;
		bus=pri;
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
		aux=pri;
		while(aux != null) {
			aux=aux.getNodoSig();
			res++;
		}
		return res;
	}
}
