import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Bob", 10);
        u1.setAddress("Vestergade 1");
        User u2 = new User("Alice", 20);
        u2.setAddress("Nørregade 2");
        User u3 = new User("Carl", 30);
        u3.setAddress("Østergade 3");

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        User found = list.findUser(new User("Bob", 11));
        System.out.println(found);

        try {
            Persister.save(list);
        } catch (IOException e) {
            System.out.println("Kunne ikke gemme brugerne: " + e.getMessage());
        }
    }
}
