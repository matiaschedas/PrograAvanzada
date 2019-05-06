package tpTDA;

public class ColaEstatica implements Cola{
	
	Object vector[];
	int cantElem;
	int tam;
	int frente;
	int fondo;

	public ColaEstatica() {
		this.tam=100;
		this.vector =  new Object[this.tam];
		this.cantElem=0;
		this.frente=0;
		this.fondo=-1;
	}
	public ColaEstatica(int tam) {
		this.tam=tam;
		this.vector =  new Object[this.tam];
		this.cantElem=0;	
		this.frente=0;
		this.fondo=-1;
	}

	@Override
	public boolean offer(Object dato) {
		if(cantElem!=tam-1) {
			if(fondo==tam-1) {
				fondo=0;
				vector[fondo] = dato;				
			}else {
				fondo++;
				this.vector[fondo] = dato;
			}
			cantElem++;
			return true;			
		}
		return false;
	}

	@Override
	public Object poll() {
		
		Object datoSacado;
		if(cantElem!=0) {
			if(frente==tam-1) {
				datoSacado = vector[frente];
				frente=0;
			}else {
				datoSacado =  vector[frente];
				frente++;
			}
			cantElem--;
			return datoSacado;			
		}
		return null;
	}

	@Override
	public Object peek() {
		if(cantElem!=0) 
			return vector[frente];		
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(cantElem==0)
			return true;
		return false;
	}

	@Override
	public void empty() {
		this.frente=0;
		this.fondo=-1;
		this.cantElem=0;
	}

}
