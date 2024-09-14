package Contest.LopUser;

import java.util.*;

public class Main {
    private List<User> users = new ArrayList<>();
    private Map<String, Integer> success = new LinkedHashMap<>();

    public void addUser(User a) {
        users.add(a);
        success.put(a.getUsername(), 0);
    }

    public void xuli(List<Login> logins) {
        Map<String, String> userData = new HashMap<>();
        for (User it : users) {
            userData.put(it.getUsername(), it.getPassword());
        }

        for (Login it : logins) {
            String username = it.getUsername();
            String password = it.getPassword();

            if (userData.containsKey(username) && userData.get(username).equals(password)) {
                success.put(username, success.get(username) + 1);
            }
        }
    }

    public void print() {
        for (int count : success.values()) {
            System.out.print(count + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String[] a = sc.nextLine().split(" ");
            String username = a[0];
            String password = a[1];
            main.addUser(new User(username, password));
        }

        int M = Integer.parseInt(sc.nextLine());
        List<Login> logins = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] a = sc.nextLine().split(" ");
            String username = a[0];
            String password = a[1];
            logins.add(new Login(username, password));
        }

        main.xuli(logins);
        main.print();

        sc.close();
    }
}
