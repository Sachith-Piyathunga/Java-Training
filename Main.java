public class Main {
	public static void main(String[] args) {
		int tableSize = 10;
		for(int i = 1; i <= tableSize; i++) {      // outer loop: rows
			for(int j = 1; j <= tableSize; j++) {  // inner loop: columns
				System.out.print(i * j);
				System.out.print("\t"); // Optional: adds better spacing
			}
			System.out.println();
		}
	}
}
