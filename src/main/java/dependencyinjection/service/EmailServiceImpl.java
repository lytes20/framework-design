package dependencyinjection.service;

import dependencyinjection.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Override
    public void send(String content) {
        System.out.println("Sending email: " + content);
    }
}
