import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> users = new ArrayList<>();

    public void add(User user) {
        if (user == null) {
            return;
        }
        users.add(user);
    }

    public User findUser(User userToFind) {
        int index = users.indexOf(userToFind);
        if (index < 0) {
            return null;
        }
        return users.get(index);
    }

    public int size() {
        return users.size();
    }

    public User get(int index) {
        return users.get(index);
    }
}
