package Contest.Class_and_Java_Collections.tochucicpcqg;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Map<String, String> mp = new HashMap<>();
        ArrayList<Team> teamList = new ArrayList<>();
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] institution = sc.nextLine().split(" ", 2);
            String id = institution[0];
            String name = institution[1];
            mp.put(id, name);
        }
        sc.close();

        sc = new Scanner(new File("REGISTER.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] team = sc.nextLine().split(" ");
            String id = team[0];
            int num = Integer.parseInt(team[1]);
            for (int j = 0; j < num; j++) {
                String teamName = sc.nextLine().trim();
                String fullName = mp.get(id);
                teamList.add(new Team(teamName, fullName));
            }
        }
        sc.close();
        Collections.sort(teamList);
        int idCounter = 1;
        for (Team team : teamList) {
            String teamID = String.format("team%02d", idCounter++);
            System.out.println(teamID + " " + team.getTeamName() + " " + team.getSchoolName());
        }
    }
}
