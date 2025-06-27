public class Bank{
  public static void main(String[] args){
    CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
    CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2");

    System.out.println("Balance of the account one: " + accountOne.getBalance());
  }
}