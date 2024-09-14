package Contest.danhsachthicpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();
        List<ThiSinh> thiSinhs = new ArrayList<>();

        int numTeam = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numTeam; i++) {
            String teamName = sc.nextLine();
            String schoolName = sc.nextLine();
            Team team = new Team(teamName, schoolName);
            teams.add(team);
        }

        int numThiSinh = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numThiSinh; i++) {
            String name = sc.nextLine();
            String teamID = sc.nextLine();
            ThiSinh thiSinh = new ThiSinh(name, teamID);
            for (Team team : teams) {
                if (team.teamID.equals(teamID)) {
                    thiSinh.team = team;
                    break;
                }
            }
            thiSinhs.add(thiSinh);
        }

        thiSinhs.sort((o1, o2) -> o1.name.compareTo(o2.name));

        for (ThiSinh thiSinh : thiSinhs) {
            System.out.println(thiSinh);
        }

        sc.close();
    }
}
