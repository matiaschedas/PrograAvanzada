package tpTDA;

public class ColaHL extends Lista implements Cola {

	@Override
	public boolean offer(Object dato) {
		return this.pushBack(dato);
	}
	@Override
	public Object poll() {
		return this.popFront();
	}
	@Override
	public Object peek() {
		return this.searchAt(0);
	}

}
