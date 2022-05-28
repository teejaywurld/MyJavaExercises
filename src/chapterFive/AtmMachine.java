package chapterFive;

public class AtmMachine {
    private String userName;
    private String phoneNumber;
    private double balance;

    public AtmMachine(String userName, String phoneNumber) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
    public String getuserName() {
        return userName;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }
    public void deposit(double depositAmount) {
        if (depositAmount < 0){
            this.balance = 0;
        }
        else
        balance += depositAmount;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount <= 0){
            withdrawalAmount = 0;
        }
        else{
            balance -= withdrawalAmount;
        }
    }
}
