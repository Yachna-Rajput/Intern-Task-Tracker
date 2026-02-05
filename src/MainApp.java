 import java.util.Scanner;

    public class MainApp {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("=== Intern Work Tracker System ===");
            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            User user = AuthService.login(email, password);

            if (user == null) {
                System.out.println("Invalid Login!");
                return;
            }

            if (user.role.equalsIgnoreCase("INTERN")) {
                System.out.println("Welcome Intern: " + user.name);
                // next step: intern menu
            } else {
                System.out.println("Welcome Manager: " + user.name);
                // next step: manager menu
            }
        }
    }


