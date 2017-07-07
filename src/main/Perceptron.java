package main;

import java.util.Random;

public class Perceptron {

	public float[] weights = new float[2];

	private float learningRate = 0.05f;

	public Perceptron() {
		for (int i = 0; i < weights.length; i++) {
			weights[i] = new Random().nextFloat() * 2 - 1;
		}
	}

	public int guess(float[] input) {
		float sum = 0;
		for (int i = 0; i < weights.length; i++) {
			sum += input[i] * weights[i];
		}
		int output = sign(sum);
		return output;
	}

	public void train(float[] input, int answer) {
		int guess = guess(input);
		int error = answer - guess;
		for (int i = 0; i < weights.length; i++) {
			weights[i] += error * input[i] * learningRate;
		}
		System.out.println(guess + " : " + (Math.abs(error) == 0 ? "RIGHT" : "WRONG"));
	}

	private int sign(float input) {
		return input >= 0 ? 1 : -1;
	}

}
