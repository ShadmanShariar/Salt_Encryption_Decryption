import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        SaltGenerator saltGenerator = new SaltGenerator();
        PasswordEncryptor passwordEncryptor = new PasswordEncryptor();
        PasswordDecryptor passwordDecryptor = new PasswordDecryptor();

        while (true) {
            String salt = saltGenerator.generateSalt();
            System.out.println(salt);
            String password = input.next();
            String encryptPassword = passwordEncryptor.encryptPassword(password, salt);
            System.out.println(encryptPassword);
            String rePassword = input.next();
            boolean equal = passwordDecryptor.authenticate(rePassword, encryptPassword, salt);
            System.out.println(equal);
            System.out.println("Type 1 to exit the program : ");
            String exit = input.next();
            if(exit.equals("1"))break;
        }

    }
}