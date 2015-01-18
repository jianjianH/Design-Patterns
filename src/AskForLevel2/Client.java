package AskForLevel2;

public class Client {
	private String leaveName;

	private int team; // 所处在的项目组

	public Client(String leaveName, int team) {
		super();
		this.leaveName = leaveName;
		this.team = team;
	}

	public String getLeaveName() {
		return leaveName;
	}

	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

}