package AskForLevel;

public class HRDepartment extends Handler {
	public HRDepartment(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getLeaveDays() <= 7) {
			System.out.println("���²�" + name + "����Ա��" + request.getLeaveName()
					+ "����������������Ϊ" + request.getLeaveDays() + "�졣");
		} else {
			System.out.println("���²�" + name + "��׼" + request.getLeaveName()
					+ "��١�");
		}
	}
}