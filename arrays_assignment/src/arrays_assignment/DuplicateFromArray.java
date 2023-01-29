package arrays_assignment;

public class DuplicateFromArray {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 6, 8, 4, 6, 10, 10 };
		int[] duplicateNumbers = new int[10];
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (i != j) {
					if (numbers[i] == numbers[j]) {
						duplicateNumbers[count++] = numbers[j];
					}
				}
			}
		}
		System.out.println();
		for (int i = 0; i < count; i++) {
			System.out.println(duplicateNumbers[i]);
		}
	}
}