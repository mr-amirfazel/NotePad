package sample.Model;

import java.io.*;

public class FileUtils {


    public void savePlayer(User user)
    {
        String fileName = user.getUsername() + ".bin";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Users/" + fileName, false);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean userExist(String username)
    {
        File directory = new File("Users/");
        String[] files = directory.list();
        String fileName = username+".bin";
        assert files != null;
        for (String fname : files)
        {
            if (fname.equals(fileName))
                return true;
        }
        return false;

    }

    public User getUser(String username)
    {
        try {
            FileInputStream fileInputStream = new FileInputStream("Users/" + username + ".bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (User) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }

}
