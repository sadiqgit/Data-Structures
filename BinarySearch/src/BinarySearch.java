
public class BinarySearch {

	public static void main(String[] args) {
		
		int numbers[] = {3,5,8,9,12,14,16,45,78};
		
		int index = binarySearch(14,numbers,0,numbers.length -1);
		
		System.out.println(index);
		
		
	}
	
	private static int binarySearch(int number,int[] numbers, int low, int high ) {
		
		int index = 0;
		int mid = (low + high)/2;
		
		if (number == numbers[mid]) {
			index = mid;
		} if (number > numbers[mid]) {	
			low = mid +1;
		} else {
		    low = mid -1;
		    high = mid;
		}
		
		binarySearch(number,numbers,low,high);
		
		if (low == high)
			index = mid;
		return index;
		
	
	}
	
	

}
