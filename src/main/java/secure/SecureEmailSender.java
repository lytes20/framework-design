package secure;

import email.EmailSender;
import email.EmailSenderImpl;

public class SecureEmailSender {
    EmailSecurityChecker emailSecurityChecker = new EmailSecurityChecker();
    EmailSender emailSender = new EmailSenderImpl();

    public void sendSecureEmail(String emailAddress, String message) {
        if (emailSecurityChecker.isEmailSecure(emailAddress)) {
            emailSender.send(emailAddress, message);
        }

    }

}
