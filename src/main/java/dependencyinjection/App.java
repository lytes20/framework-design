package dependencyinjection;


import dependencyinjection.service.BankService;
import dependencyinjection.service.BankServiceImpl;
import dependencyinjection.service.EmailService;
import dependencyinjection.service.EmailServiceImpl;

public class App {
    public static void main(String[] args) {
//        BankService bankService = new BankServiceImpl();
//        EmailService emailService = new EmailServiceImpl();
//
//        bankService.setEmailService(emailService);
//        bankService.deposit(200.00);

        FWContext fwContext = new FWContext();
        BankService bankService = (BankService) fwContext.getBeanOfType(BankService.class);
        if(bankService != null) bankService.deposit(200);
    }
}
