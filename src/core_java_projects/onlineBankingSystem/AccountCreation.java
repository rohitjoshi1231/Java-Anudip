package core_java_projects.onlineBankingSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class AccountCreation extends Account {
    private String name;
    private String contactNumber;
    private String aadhaarNumber; //ID Proof
    private int age;
    private char gender;
    final String branch;
    private boolean isAccountCreated = false;
    final ArrayList<String> accountDetails = new ArrayList<>();
    HashMap<String, Integer> balanceInquiry = new HashMap<>();

    private final String accountNumber = String.valueOf(accountNumber());


    void printAccDetails() {
        for (String details : accountDetails) {
            System.out.println(details);
        }
    }


    public AccountCreation(
            String name,
            String contactNumber,
            String aadhaarNumber,
            int age,
            char gender,
            String branch
    ) {
        if (age < 16 || age > 120) {
            System.out.println("Minimum age is 16 or Invalid age");
        } else if (contactNumber.length() != 10) {
            System.out.println("Incorrect number format");
        } else if (aadhaarNumber.length() != 12) {
            System.out.println("Incorrect aadhaar number");
        } else if (gender != 'M' && gender != 'F') {
            System.out.println("Invalid gender, enter either 'M' or 'F'");
        } else {
            accountDetails.add(name);
            accountDetails.add(contactNumber);
            accountDetails.add(aadhaarNumber);
            accountDetails.add(String.valueOf(age));
            accountDetails.add(String.valueOf(gender));
            accountDetails.add(branch);
            isAccountCreated = true;
        }

        this.branch = branch;
        this.name = name;
        this.contactNumber = contactNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.age = age;

    }


    public ArrayList<String> getAccountDetails() {
        return accountDetails;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char isGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getBranches() {
        return branch;
    }

    public boolean isAccountCreated() {
        return isAccountCreated;
    }

    @Override
    protected int accountNumber() {
        return (int) (Math.random() * 1000000000);
    }


    public void setBalance(int balance) {
        balanceInquiry.put(getAccountNumber(), balance);
    }
}
