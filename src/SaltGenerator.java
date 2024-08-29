import java.security.SecureRandom;
import java.util.Base64;

public class SaltGenerator {

    public String generateSalt(){

        byte [] salt = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);

    }
}
