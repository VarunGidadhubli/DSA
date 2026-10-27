package datastructures.code.general;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {

		int arr[] = { 0, 5, 0, 0, 2, 8, 0, 4 };

		int lastIndex = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				if (arr[lastIndex] == 0) {

					while (lastIndex>i && arr[lastIndex] == 0) {
						--lastIndex;
					}

				}

				if (lastIndex > i) {
					int temp = arr[i];
					arr[i] = arr[lastIndex];
					arr[lastIndex] = temp;
					--lastIndex;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}