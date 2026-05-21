package dependencyinjection.service;

public interface BankService {
    void deposit(double amount);
    void setEmailService(EmailService emailService);
}
