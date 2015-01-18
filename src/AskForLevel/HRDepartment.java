package AskForLevel;

public class HRDepartment extends Handler {
	public HRDepartment(String name) {
		super(name);
	}

	public void handleRequest(Client request) {
		if (request.getLeaveDays() <= 7) {
			System.out.println("人事部" + name + "审批员工" + request.getLeaveName()
					+ "的请假条，请假天数为" + request.getLeaveDays() + "天。");
		} else {
			System.out.println("人事部" + name + "不准" + request.getLeaveName()
					+ "请假。");
		}
	}
}