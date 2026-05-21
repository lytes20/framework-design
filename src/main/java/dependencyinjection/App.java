package dependencyinjection;


import dependencyinjection.service.BankService;

public class App implements Runnable {

    @Inject
    BankService bankService;

    public static void main(String[] args) {
        FWApplication.run(App.class);
    }

    @Override
    public void run() {
        bankService.deposit(200);
    }
}
