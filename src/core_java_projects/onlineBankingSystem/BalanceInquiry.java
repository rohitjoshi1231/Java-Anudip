package core_java_projects.onlineBankingSystem;

public class BalanceInquiry extends AccountCreation{


    public BalanceInquiry(String name, String contactNumber, String aadhaarNumber, int age, char gender, String branch) {
        super(name, contactNumber, aadhaarNumber, age, gender, branch);
    }

    @Override
    protected int accountNumber() {
        return super.accountNumber();
    }
}

abstract class Account {
    protected abstract int accountNumber();
}