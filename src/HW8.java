import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = input.next();
        System.out.println("Введите пароль");
        String password = input.next();
        System.out.println("Подтвердите пароль");
        String confirmPassword = input.next();

        checkInput(login, password, confirmPassword);
    }

    private static void checkInput(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 6) {
                throw new WrongLoginException("too long login");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            if (password.length() >= 10 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("password mismatch or too long");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}