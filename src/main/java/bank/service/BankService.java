package bank.service;

import email.EmailSender;

public interface BankService {
    void deposit(double amount);
    void setEmailSender(EmailSender emailSender);
}
