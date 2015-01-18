package AskForLevel;

public class Manager extends Handler {
	public Manager(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getLeaveDays() <= 3) {
			System.out.println("��Ŀ����" + name + "����Ա��" + request.getLeaveName()
					+ "����������������Ϊ" + request.getLeaveDays() + "�졣");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}