package main;

import java.util.Random;

public class Point {

	public float[] position;

	public int name;

	public Point(float x, float y, int name) {
		position = new float[2];
		position[0] = x;
		position[1] = y;
		this.name = name;
	}

	public Point() {
		position = new float[2];
		for (int i = 0; i < position.length; i++) {
			position[i] = new Random().nextFloat() * 2 - 1;
		}
		if (position[0] > position[1]) {
			name = 1;
		} else {
			name = -1;
		}
	}

	@Override
	public String toString() {
		return position[0] + "," + position[1];
	}

}
