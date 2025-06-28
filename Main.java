public class Main {
  public static void main(String[] args) {
    Dinner noodlesDinner = new Dinner();

    // Instantiate BiangBiang as a Noodle
    Noodle biangBiang = new BiangBiang();

    // ✅ Call makeNoodles with the correct arguments
    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
  }
}
