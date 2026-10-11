import java.util.Objects;

public class User {
    private static final int MAX_NAME_LENGTH = 100;

    public int id;
    public String name;
    public String address;

    public User(String name, int id) {
        this.id = id;
        setName(name);
    }

    public void setName(String name) {
        if (name == null || name.length() > MAX_NAME_LENGTH) {
            return;
        }
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User u) {
            return Objects.equals(name, u.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}
