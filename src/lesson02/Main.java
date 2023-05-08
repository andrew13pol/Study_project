package lesson02;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.age=25;
        user.name="Danil";
        user.pasportData="123456";
        System.out.println(user.age);
        user.talk("Hello");
    }
}
