package domein;

public abstract class PersistenceFactory {

	protected abstract Reader createReader();

	protected abstract Writer createWriter();

}