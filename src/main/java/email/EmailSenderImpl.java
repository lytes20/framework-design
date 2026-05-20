package email;

public class EmailSenderImpl implements EmailSender{
    @Override
    public void send(String emailAddress, String message) {
        System.out.println("Sending email");
    }
}
