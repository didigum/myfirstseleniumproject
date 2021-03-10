import java.util.HashMap;

public class MaximumOccurence {

	public static void main(String[] args) {

		int[] data = { 1, 3, 5, 6, 2, 1, 5, 7, 8, 4, 2, 1, 3, 5, 7, 8 };

		for (int i = 0; i < data.length; i++) {
			int count = 0;
			for (int j = 0; j < data.length; j++) {

				if (data[i] == data[j]) {
					count++;
				}
			}
			if (count >= 2) {
				System.out.println("The Repeated Number is  " + data[i] + " is " + +count + " times");
			}
		}
		
		
	}
}
