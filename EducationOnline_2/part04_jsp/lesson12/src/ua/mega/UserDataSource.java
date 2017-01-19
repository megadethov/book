package ua.mega;

import java.io.*;

public class UserDataSource {
    User getUserByUsernameAndPassword(String username, String password) throws IOException {
        try (FileReader fr = new FileReader(new File("c:/temp/user.txt"));
                BufferedReader br = new BufferedReader(fr);) {
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                if (cols[0].equals(username) && cols[1].equals(password)) {
                    User user = new User();
                    user.setUsername(cols[0]);
                    user.setPassword(cols[1]);
                    user.setName(cols[2]);
                    user.setAge(Integer.parseInt(cols[3]));

                    return user;
                }
            }
        }
        return null;
    }
}
