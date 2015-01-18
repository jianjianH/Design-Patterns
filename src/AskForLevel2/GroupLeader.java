package AskForLevel2;

public class GroupLeader extends Handler {
	public GroupLeader(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getTeam() == 1 || request.getTeam() == 2) {
			System.out.println("�鳤" + name + "�����" + request.getTeam() + "��Ա��"
					+ request.getLeaveName() + "�����");

			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		} else {
			System.out.println("�鳤" + name + "��Ϊ��" + request.getTeam() + "��Ա��"
					+ request.getLeaveName() + "��Ŀ��չ�������������");
		}
	}
}