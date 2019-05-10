package tpTDA;

public class PilaCL implements Pila{
	Lista lista;

	public void Pila() {
		lista = new Lista();
	}
	
	@Override
	public boolean push(Object dato) {
		return lista.pushFront(dato);
	}

	@Override
	public Object pop() {
		return lista.popFront();
	}

	@Override
	public Object peek() {
		return lista.searchAt(0);
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public void empty() {
		lista.empty();
	}
}

