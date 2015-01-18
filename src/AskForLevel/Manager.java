package AskForLevel;

public class Manager extends Handler {
	public Manager(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getLeaveDays() <= 3) {
			System.out.println("项目经理" + name + "审批员工" + request.getLeaveName()
					+ "的请假条，请假天数为" + request.getLeaveDays() + "天。");
		} else {
			if (this.successor != null) {
				this.successor.handleRequest(request);
			}
		}
	}
}