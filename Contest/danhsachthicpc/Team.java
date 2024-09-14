package Contest.danhsachthicpc;

public class Team {
    public static int NUM = 1;
    public String teamID, teamName, schoolName;

    public Team(String teamName, String schoolName) {
        this.teamID = String.format("Team%02d", NUM++);
        this.teamName = teamName;
        this.schoolName = schoolName;
    }
}
