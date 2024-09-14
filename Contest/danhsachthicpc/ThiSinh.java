package Contest.danhsachthicpc;

public class ThiSinh {
    public static int NUM = 1;
    public String ID, name, teamID;
    public Team team;

    public ThiSinh(String name, String teamID) {
        this.ID = String.format("C%03d", NUM++);
        this.name = name;
        this.teamID = teamID;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + team.teamName + " " + team.schoolName;
    }
}
