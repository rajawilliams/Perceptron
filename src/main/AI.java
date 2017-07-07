package main;

public class AI {

	public static Perceptron brain;

	public static Point[] points = new Point[5];

	public static void main(String[] args) {
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point();
		}
		brain = new Perceptron();
		for (int e = 0; e < 100; e++) {
			System.out.println(brain.weights[0] + ", " + brain.weights[1]);
			for (int i = 0; i < 2; i++) {
				for (Point point : points) {
					brain.train(point.position, point.name);
				}
			}
			System.out.println(brain.weights[0] + ", " + brain.weights[1]);
			System.out.println();
		}

	}
}
