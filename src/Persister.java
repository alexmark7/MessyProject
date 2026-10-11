import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Persister {
    private static final String FILE_NAME = "users.txt";

    public static void save(UserList users) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int x = 0; x < users.size(); x++) {
                User user = users.get(x);
                bw.write(user.c_nam + " " + user.geti());
                bw.newLine();
            }
        }
    }
}
