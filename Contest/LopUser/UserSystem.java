package Contest.LopUser;

import java.util.*;

public class UserSystem {
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
                success.put(username, success.getOrDefault(username, 0) + 1);
            }
        }
    }

    public void print() {
        for (Map.Entry<String, Integer> entry : success.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }
}
