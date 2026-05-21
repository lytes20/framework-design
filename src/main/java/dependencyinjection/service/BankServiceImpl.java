package dependencyinjection.service;

import dependencyinjection.Inject;
import dependencyinjection.Service;

@Service
public class BankServiceImpl implements BankService{

    @Inject
    private EmailService emailService;

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void deposit(double amount) {
        emailService.send( " Deposited 👍🏿");
    }
}
