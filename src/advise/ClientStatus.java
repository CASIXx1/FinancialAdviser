package advise;

import java.util.List;

public class ClientStatus {
	private List getQAStatus(AbstractClient abstractClient) {
		List<Advise> advises = abstractClient.getAdviseList();
		for (Advise advise : advises) {
			if (advise.getStatus() == "") {
				System.out.println(advise.getTitle() + "のQAは完了してます。");
			} else {
				System.out.println(advise.getTitle() + "のQAは未完了です。");
			}
		}
	}
}
