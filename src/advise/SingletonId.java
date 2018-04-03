package advise;


public class SingletonId {
	private static SingletonId singletonId = new SingletonId();
	private int id = 1;

	private SingletonId() {

	}

	public synchronized int getId() {
		return id++;
	}

	public static synchronized SingletonId getInstance() {
		return singletonId;
	}
}
