package gitHubPractice;

public class GitClass {

	public static void main(String[] args) {
		String[][] cars = { { "Mercedes", "VW" }, { "Honda", "Acura" }, { "Toyota", "Lexus" } };
		// String x = cars[2][1];
		// System.out.println(x);
		System.out.println(cars[0][0]);
		System.out.println(cars[0][1]);
		System.out.println(cars[1][0]);
		System.out.println(cars[1][1]);
		System.out.println(cars[2][0]);
		System.out.println(cars[2][1]);
		System.out.println("================");

		for (int i = 0; i < cars.length; ++i) {
			for (int j = 0; j < cars[i].length; ++j) {
				System.out.println(cars[i][j]);
			}

		}

	}

}
