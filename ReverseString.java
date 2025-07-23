public class ReverseString {
    public static void main(String[] args) {

        String input = "Hello";
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Reversed: " + reversed);
    }
}
