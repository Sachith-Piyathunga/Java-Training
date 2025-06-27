public class ATM {
  // Static variables (shared across all ATM objects)
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variable (unique to each ATM object)
  public int money;

  public ATM(int inputMoney) {
    this.money = inputMoney;

    // Step 1: Increase the number of ATMs
    numATMs++;

    // Step 2: Add the ATM's money to the total money in the system
    totalMoney += inputMoney;
  }

  public void withdrawMoney(int amountToWithdraw) {
    if (amountToWithdraw <= this.money) {
      this.money -= amountToWithdraw;

      // Step 3: Subtract withdrawn money from totalMoney
      totalMoney -= amountToWithdraw;
    }
  }

  public static void main(String[] args) {
    // Print initial number of ATMs
    System.out.println("Total number of ATMs: " + ATM.numATMs); 

    // Create two ATMs
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);

    // Print updated number of ATMs
    System.out.println("Total number of ATMs: " + ATM.numATMs); 

    // Print total money in all ATMs
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  

    // Withdraw money from both ATMs
    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);

    // Print updated total money
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    
  }
}
