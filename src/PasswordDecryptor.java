public class PasswordDecryptor {

    public boolean authenticate(String providedPassword, String storedPassword, String salt) throws Exception{

        PasswordEncryptor passwordEncryptor = new PasswordEncryptor();

        String newEncryptedPassword = passwordEncryptor.encryptPassword(providedPassword,salt);
        return newEncryptedPassword.equals(storedPassword);

    }

}
