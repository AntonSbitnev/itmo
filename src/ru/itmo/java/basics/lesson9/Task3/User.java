package ru.itmo.java.basics.lesson9.Task3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Map<User, Integer> scores = new HashMap<>();

        scores.put(new User("Alex"), 630);
        scores.put(new User("Bree"), 350);
        scores.put(new User("Ted"), 200);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String userName = scanner.nextLine();

        int userScore = 0;
        for (Map.Entry<User, Integer> entry : scores.entrySet()) {
            if (entry.getKey().getName().equals(userName)) {
                userScore = entry.getValue();
                break;
            }
        }

        System.out.println("Количество очков для пользователя " + userName + ": " + userScore);
    }
}
