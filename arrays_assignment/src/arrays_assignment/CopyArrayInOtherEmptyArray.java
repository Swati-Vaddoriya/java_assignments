package arrays_assignment;

public class CopyArrayInOtherEmptyArray {
	public static void main(String[] args) {
		int[] array = {3,5,7,9};
		int[] array2 = {};
		
		array2 = array;
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}
}
