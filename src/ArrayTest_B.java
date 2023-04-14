
public class ArrayTest_B {

	public static void main(String[] args) {
		int arr[] = {10, 30, 20, 50, 80};
//		System.out.println(arr);
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			count++;
		}
		System.out.println("배열의 원소의 개수: " + count);
	}

}
