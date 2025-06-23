public class dog {
  String breed;
  boolean hasOwner;
  int age;
  String name;
  
  public dog(String dogBreed, boolean dogOwned, int dogYears, String dogName) {
    System.out.println("Constructor invoked!");
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
    name = dogName;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");
    dog fido = new dog("poodle", false, 4, "Falo");
    dog nunzio = new dog("shiba inu", true, 12, "lolo");
    boolean isFidoOlder = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("The name of this beautiful dog is: " + nunzio.name);
    System.out.println("Main method finished");
  }
}