package arrays_assignment;

public class CopyArrayInOtherEmptyArray {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int[] array2 = {};
		
		array2 = array;
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
	}
}
