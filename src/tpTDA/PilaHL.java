package tpTDA;

public class PilaHL extends Lista implements Pila {
	@Override
	public boolean push(Object dato) {
		return this.pushFront(dato);
	}
	@Override
	public Object pop() {
		return this.popFront();
	}
	@Override
	public Object peek() {
		return this.searchAt(0);
	}
}
