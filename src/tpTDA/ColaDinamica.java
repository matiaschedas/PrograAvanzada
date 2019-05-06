package tpTDA;

public class ColaDinamica implements Cola {

	private Nodo frente;
	private Nodo fondo;

	public void Cola() {
		frente=null;
		fondo=null;
	}
	@Override
	public boolean offer(Object dato) {
		Nodo nue;
		try {
			 nue = new Nodo(dato,null);
		}catch (Exception e) {
			return false;
		}
		if(fondo == null && frente == null) {
			frente = fondo = nue;			
		}else {			
			fondo.setNodoSig(nue);
			fondo=nue;
		}		
		return true;
	}

	@Override
	public Object poll() {
		Nodo nae;
		if(frente!=null) {			
			nae=frente;
			frente=nae.getNodoSig();
			return nae.getDato();
		}			
		return null;
	}

	@Override
	public Object peek() {
		if(frente!=null)
			return frente.getDato();
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(frente==null)
			return true;
		return false;
	}

	@Override
	public void empty() {
		frente=fondo=null;
	}

}
