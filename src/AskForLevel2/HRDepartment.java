package AskForLevel2;

public class HRDepartment extends Handler {
	public HRDepartment(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		System.out.println("���²�" + name + "��¼" + request.getTeam() + "��Ա��"
				+ request.getLeaveName() + "�����");
	}
}