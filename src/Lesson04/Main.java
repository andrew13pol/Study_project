package Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.readLine());
        if (age > 18) {
            System.out.println("Adult connect");
        } else {
            System.out.println("No connect");
        }
    }
}
