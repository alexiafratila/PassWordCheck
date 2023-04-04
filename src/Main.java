public class Main {
    public static void main(String[] args) {

        // Cazul 1: parola indeplineste toate conditiile => 0
        String password1 = "MyPassword123";
        int result1 = Passwrd.checkPassword(password1);
        System.out.println("Test case 1 result: " + result1);

        // Cazul 2: parola e prea scurta => 3
        String password2 = "Mp1";
        int result2 = Passwrd.checkPassword(password2);
        System.out.println("Test case 2 result: " + result2);

        // Cazul 3: parola e prea lunga => 2
        String password3 = "LongPassword1234567890";
        int result3 = Passwrd.checkPassword(password3);
        System.out.println("Test case 3 result: " + result3);

        // Cazul 4: parola nu are litera mica => 1
        String password4 = "PASSWORD123";
        int result4 = Passwrd.checkPassword(password4);
        System.out.println("Test case 4 result: " + result4);

        // Cazul 5: parola nu are litera mare => 1
        String password5 = "password123";
        int result5 = Passwrd.checkPassword(password5);
        System.out.println("Test case 5 result: " + result5);

        // Cazul 7: parola nu are cifre => 1
        String password6 = "MyPassword";
        int result6 = Passwrd.checkPassword(password6);
        System.out.println("Test case 6 result: " + result6);

        // Cazul 6: are caractere consecutive la fel => 1
        String password7 = "Passsword123";
        int result7 = Passwrd.checkPassword(password7);
        System.out.println("Test case 7 result: " + result7);

    }
}