package bank;

import bank.service.BankService;
import bank.service.BankServiceImpl;
import email.EmailSender;
import email.EmailSenderImpl;
import secure.SecureEmailSender;

public class App {
    public static void main(String[] args) {
        BankServiceImpl bankService = new BankServiceImpl();
        SecureEmailSender emailSender = new SecureEmailSender();

        bankService.setSecureEmailSender(emailSender);
        bankService.deposit(200.00);
    }
}
