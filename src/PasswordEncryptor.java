import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

public class PasswordEncryptor {

    public String encryptPassword (String password, String salt) throws Exception {

        int iteration = 10000;
        int keyLength = 256;
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(),
        Base64.getDecoder().decode(salt), iteration, keyLength);
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.
                getInstance("PBKDF2WithHmacSHA256");
        byte[] hashPassword = secretKeyFactory.generateSecret(keySpec).getEncoded();
        return Base64.getEncoder().encodeToString(hashPassword);

    }

}
