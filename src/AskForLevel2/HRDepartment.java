package AskForLevel2;

public class HRDepartment extends Handler {
	public HRDepartment(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		System.out.println("人事部" + name + "记录" + request.getTeam() + "组员工"
				+ request.getLeaveName() + "的请假");
	}
}