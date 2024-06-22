import java.util.ArrayList;
import java.util.List;

public class UsersData {
    private List<User> users;

    public UsersData() {
        users = new ArrayList<>();
        users.add(new User("doctor1", "password1", "Doctor"));
        users.add(new User("nurse1", "password2", "Nurse"));
        users.add(new User("patient1", "password3", "Patient"));
    }

    public User validateLogin(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
