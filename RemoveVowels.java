public class RemoveVowels {
    public static void main(String[] args) {
        String input = "beautiful";
        String result = input.replaceAll("{aeiouAEIOU}", "");

        System.out.println("Without vowels: " + result);
    }
}
