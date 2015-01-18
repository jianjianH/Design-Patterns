package AskForLevel2;

import AskForLevel2.Client;

public class Main {
	public static void main(String args[]) {
		Handler groupLeader, manager, hr;

		groupLeader = new GroupLeader("����");
		manager = new Manager("��ǿ");
		hr = new HRDepartment("�");

		groupLeader.setSuccessor(manager);
		manager.setSuccessor(hr);

		Client lr1 = new Client("����", 1);
		groupLeader.handleRequest(lr1);

		Client lr2 = new Client("����", 2);
		groupLeader.handleRequest(lr2);

		Client lr3 = new Client("����", 3);
		groupLeader.handleRequest(lr3);
	}
}