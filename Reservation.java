public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
  // Test case 1: Valid reservation (within guest limit, enough capacity, open)
  System.out.println("=== Test Case 1 ===");
  Reservation res1 = new Reservation(4, 10, true);
  res1.confirmReservation();
  res1.informUser();

  // Test case 2: Not enough capacity
  System.out.println("\n=== Test Case 2 ===");
  Reservation res2 = new Reservation(6, 4, true);
  res2.confirmReservation();
  res2.informUser();

  // Test case 3: Restaurant is closed
  System.out.println("\n=== Test Case 3 ===");
  Reservation res3 = new Reservation(2, 10, false);
  res3.confirmReservation();
  res3.informUser();

  // Test case 4: Invalid guest count (too many)
  System.out.println("\n=== Test Case 4 ===");
  Reservation res4 = new Reservation(10, 15, true);  // Should print "Invalid reservation!"
  res4.confirmReservation();
  res4.informUser();

  // Test case 5: Invalid guest count (too few)
  System.out.println("\n=== Test Case 5 ===");
  Reservation res5 = new Reservation(0, 15, true);  // Should print "Invalid reservation!"
  res5.confirmReservation();
  res5.informUser();
}

}