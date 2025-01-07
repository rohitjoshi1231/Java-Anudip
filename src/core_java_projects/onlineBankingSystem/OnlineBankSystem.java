package core_java_projects.onlineBankingSystem;

public class OnlineBankSystem {

    public static void main(String[] args) {

        AccountCreation creation = new AccountCreation(
                "Rohit Joshi",
                "9019536293",
                "123456789101",
                23,
                'M',
                "Noida"
        );

        System.out.println(creation.getAccountNumber());


    }
}
