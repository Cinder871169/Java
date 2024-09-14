package Contest.LopUser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserSystem userSystem = new UserSystem();

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String[] a = sc.nextLine().split(" ");
            String username = a[0];
            String password = a[1];
            userSystem.addUser(new User(username, password));
        }

        int M = Integer.parseInt(sc.nextLine());
        List<Login> logins = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] a = sc.nextLine().split(" ");
            String username = a[0];
            String password = a[1];
            logins.add(new Login(username, password));
        }

        userSystem.xuli(logins);
        userSystem.print();

        sc.close();
    }
}
