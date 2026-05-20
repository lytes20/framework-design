package bank.service;

import email.EmailSender;
import secure.SecureEmailSender;

public class BankServiceImpl implements BankService {
    private SecureEmailSender secureEmailSender;
    private EmailSender emailSender;

    @Override
    public void deposit(double amount) {
        secureEmailSender.sendSecureEmail("gideon",  "Deposit done");
    }

    public void setSecureEmailSender(SecureEmailSender secureEmailSender){
        this.secureEmailSender = secureEmailSender;
    }


    @Override
    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
}
