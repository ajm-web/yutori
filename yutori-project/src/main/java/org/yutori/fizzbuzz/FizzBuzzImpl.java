package main.java.org.yutori.fizzbuzz;

public class FizzBuzzImpl implements FizzBuzz{

	public String calc(int i) {

		if (i % 15 == 0) {

			return "FizzBuzz";

		} else if(i % 3 == 0) {

			return "Fizz";

		} else if(i % 5 == 0) {

			return "Buzz";

		} else {

			return Integer.toString(i);

		}

	}


}
