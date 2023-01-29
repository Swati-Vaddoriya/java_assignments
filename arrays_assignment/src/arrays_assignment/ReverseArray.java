package arrays_assignment;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40 };
		int[] numbers2 = new int[numbers.length];

		for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
			numbers2[i] = numbers[j];
		}
		System.out.println();
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
	}

}
