import java.util.ArrayList;

public class UserList {
    private ArrayList<User> user = new ArrayList<>();

    public void add(User u) {
        if (u == null) {
            return;
        }
        user.add(u);
    }

    public ArrayList<User> getu(User userToFind) {
        return user;
    }

    public int size() {
        return user.size();
    }

    public User get(int index) {
        return user.get(index);
    }


}
