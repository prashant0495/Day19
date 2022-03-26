package day19;
// User Registration System using Regex
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Welcome to User Registration \n Enter your First name:");
        userRegistration.name();

        System.out.println("Enter your Last name:");
        userRegistration.name();

        System.out.println("Enter your Email ID:");
        userRegistration.email();

        System.out.println("Enter your Mobile number:");
        userRegistration.mobile();

        System.out.println("Enter your Password:");
        userRegistration.password();
    }

    private void name() {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher matcher = pattern.matcher(sc.next());
        System.out.println(matcher.find());
    }

    private void email() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([_.+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$");
        Matcher matcher = pattern.matcher(sc.next());
        System.out.println(matcher.find());
    }

    private void mobile() {
        Pattern pattern = Pattern.compile("^(\\+91|0|91)?[9876][0-9]{9}$");
        Matcher matcher = pattern.matcher(sc.next());
        System.out.println(matcher.find());
    }

    private void password() {
        Pattern pattern = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        Matcher matcher = pattern.matcher(sc.next());
        System.out.println(matcher.find());
    }
}
