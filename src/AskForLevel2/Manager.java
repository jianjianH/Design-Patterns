package AskForLevel2;

public class Manager extends Handler {
	public Manager(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getTeam() == 2 || request.getTeam() == 3) {
			System.out.println("项目经理" + name + "允许第" + request.getTeam()
					+ "组员工" + request.getLeaveName() + "的请假");

			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		} else {
			System.out.println("项目经理" + name + "认为第" + request.getTeam()
					+ "组员工" + request.getLeaveName() + "项目进展慢，不允许请假");
		}
	}
}