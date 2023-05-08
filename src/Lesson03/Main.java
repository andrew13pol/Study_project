package Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//System.in Чтение данных из консоли

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int a = Integer.parseInt(str);
        System.out.println(a * 2);

    }
}
