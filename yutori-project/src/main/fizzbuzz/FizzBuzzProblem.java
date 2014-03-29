package main.fizzbuzz;

public class FizzBuzzProblem {

	public static void main(String[] args) {

		FizzBuzzTest fizzbuzz = new FizzBuzzTest();

		for (int i=0; i<20; ++i) {

			System.out.println( i + " : " + fizzbuzz.calc(i));

		}

	}

}
