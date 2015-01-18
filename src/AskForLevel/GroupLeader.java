package AskForLevel;

public class GroupLeader extends Handler {
	public GroupLeader(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getLeaveDays() <= 1) {
			System.out.println("�鳤" + name + "����Ա��" + request.getLeaveName()
					+ "����������������Ϊ" + request.getLeaveDays() + "�졣");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}