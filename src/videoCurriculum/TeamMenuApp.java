package videoCurriculum;

public class TeamMenuApp {

	public static void main(String[] args) {
		
	Player p1 = new Player("Thomas", "Fullback", "Running Fast");
	Player p2 = new Player("Sally", "Quarterback", "Throwing Far");
	
	Team team = new Team("Really Good Football Team!!!");
	team.addPlayer(p1);
	team.addPlayer(p2);
	team.describe();

	team.removePlayer("Thomas");
	team.describe();
	}

}
