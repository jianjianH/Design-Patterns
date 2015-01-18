package AskForLevel2;

public class Manager extends Handler {
	public Manager(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getTeam() == 2 || request.getTeam() == 3) {
			System.out.println("��Ŀ����" + name + "�����" + request.getTeam()
					+ "��Ա��" + request.getLeaveName() + "�����");

			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		} else {
			System.out.println("��Ŀ����" + name + "��Ϊ��" + request.getTeam()
					+ "��Ա��" + request.getLeaveName() + "��Ŀ��չ�������������");
		}
	}
}