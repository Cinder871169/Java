package Contest.Class_and_Java_Collections.tochucicpcqg;

public class Team implements Comparable<Team> {
    private String teamName;
    private String schoolName;

    public Team(String teamName, String schoolName) {
        this.teamName = teamName;
        this.schoolName = schoolName;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public int compareTo(Team other) {
        int cmp = this.schoolName.compareTo(other.getSchoolName());
        if (cmp == 0) {
            return this.teamName.compareTo(other.getTeamName());
        }
        return cmp;
    }

    @Override
    public String toString() {
        return teamName + " " + schoolName;
    }
}
