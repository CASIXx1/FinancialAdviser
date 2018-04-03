package advise;

import java.util.Map;
import java.util.TreeMap;

public class ClientPool {
	private static ClientPool clientPool = new ClientPool();
	private Map<Integer, AbstractClient> clientMap = new TreeMap();

	private ClientPool() {

	}

	public static ClientPool getInstance() {
		return clientPool;
	}

	public Map<Integer, AbstractClient> getClientMap() {
		return clientMap;
	}

	public void setClient(int clientId, AbstractClient abstractClient) {
		this.clientMap.put(clientId, abstractClient);
	}
}
