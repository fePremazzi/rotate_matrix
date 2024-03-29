package App;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		
		showMatrix(matrix);
		
		int[][] mx = rotate(matrix);
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");

		showMatrix(mx);
	}
	
	public static void showMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.print("\n");
		}
	}
	
	public static int[][] rotate(int[][] matrix) {
		if (matrix == null)
			return null;// w w w .jav a2 s . c om
		int N = matrix.length;
		for (int i = 0; i < N / 2; i++) // This is the layer
			for (int j = i; j < N - i - 1; j++) { // This is the offset to start
				// swap
				int t = matrix[i][j];
				matrix[i][j] = matrix[N - j - 1][i];
				matrix[N - j - 1][i] = matrix[N - i - 1][N - j - 1];
				matrix[N - i - 1][N - j - 1] = matrix[j][N - i - 1];
				matrix[j][N - i - 1] = t;
			}
		return matrix;
	}

}