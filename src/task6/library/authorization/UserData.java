package task6.library.authorization;

import task6.library.user.User;

import java.io.*;
import java.util.HashMap;

public class UserData {
    private String userDataFile = "userData.txt";
    private HashMap<String,String> userHashMap= new HashMap<>();

    public UserData() {
        readerFileUser();
    }

    public void writeUserFile(User user){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(userDataFile,true))){
            bufferedWriter.write(user.getLogin()+"|"+user.getPasswordHash()+"|"+user.isAdmin());
            bufferedWriter.newLine();

        } catch (IOException e) {
            System.out.println("Ошибка при записи данных пользователя в файл");
        }
    }
    public void readerFileUser(){
        String line;
        String[] buffer;
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader(userDataFile))){
            while (null != (line = bufferedReader.readLine())){
                buffer=line.split("\\|");
                if (buffer.length>1){
                    userHashMap.put(buffer[0],buffer[1]+"|"+buffer[2]);
                }

            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении данных пользователя из файла");
        }
    }
    public User registrationUser(String login,String password,boolean admin){
        int passwordHash = getPasswordHash(password);
        userHashMap.put(login,passwordHash+"|"+admin);

        User user = new User(login,passwordHash,admin);
        writeUserFile(user);

        return user;
    }

    public User userVerification(String login,String password){
        if(userHashMap.get(login)==null){
            return null;
        }
        int passwordHashVer = getPasswordHash(password);
        int passwordHash = Integer.parseInt(userHashMap.get(login).split("\\|")[0]);
        boolean admin = Boolean.parseBoolean(userHashMap.get(login).split("\\|")[1]);
        if(passwordHashVer==passwordHash){
            return new User(login,passwordHash,admin);
        }else return null;
    }

    public boolean loginBoolean(String login){
        if(userHashMap.get(login)==null){
            return false;
        }
        return true;
    }

    public int getPasswordHash(String password){
        return password.hashCode();
    }
}
