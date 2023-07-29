package week4Project;

import java.util.Arrays;

public class ProjectWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//System.out.println(Arrays.toString(ages));
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		// To subtract the value of the first value from the last value we have to find the index of the first value, which is 0, and we find the last value which is the length of the array minus 1. 
		System.out.println("1.");
		int[] ages = {3,9,23,64,2,8,28,93};
		
		int firstIndex = 0;
		int lastIndex = ages.length - 1; 
		
		int firstValue = ages[firstIndex];
		int lastValue = ages[lastIndex];
		
		int result = lastValue - firstValue; 
		
		System.out.println("Result = " + result);
		
		//b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//Here I just follow the steps from the previous section but with two more elements in the array.
		int[] stages = {5,8,23,42,7,11,9,67,90};
		
		int firstStage = 0;
		int lastStage = stages.length -1;
		
		int valueFirstStage = stages[firstStage];
		int valueLastStage = stages[lastStage];
		
		int answer = valueLastStage - valueFirstStage;
		System.out.println("Result = " + answer);
		
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		// To calculate the sum I use a for loop to sum up all the ages
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		
		}
		// To calculate the average I divide the sum by the number of elements in the array.
		//double average = (double) sum / ages.length; 
		
		System.out.println("Average: " + sum / ages.length);
		
		
		System.out.println("------------------------------------------------------------------"); 
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//Here I declare and initialize the array string
		System.out.println("2.");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		// Here I am getting the total number of letters in all the strings with a for loop, storing that number in an integer called totalLetters.
		
		int totalLetters = 0;
		for (int i = 0; i < names.length; i++) {
		totalLetters += names[i].length(); 
		}
		//Here I take the total number of letters per index and divide them by the the number indexes in the array.
		
		double averageLetters = (double) totalLetters / names.length; 
		
		System.out.println("Average number of letters per name: " + averageLetters);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		// Here I am looping through the names array and I append each name to resultBuilder
		
		StringBuilder resultBuilder = new StringBuilder();
		for (int j = 0; j < names.length; j++) {
			resultBuilder.append(names[j]);
			if(j < names.length - 1) {
				resultBuilder.append(" ");
			}
		}
		//Here I make the StringBuilder to String and print out the result
		String concatenatedString = resultBuilder.toString();
		System.out.println("Concatenated String: " + concatenatedString);
		
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("3. How do you access the last element of any array?");
		System.out.println("To find the last element of an array you type: ");
		System.out.println(" int last = list.get(list.size() - 1);");
		
		
		System.out.println("------------------------------------------------------------------");
		
		
		System.out.println("4. How do you access the first element of any array?");
		System.out.println("To access the first element of an array you type: ");
		System.out.println("int first = list.get(0)");
		
		
		
		System.out.println("------------------------------------------------------------------");
		
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		System.out.println("5.");
		//Here I declare the new int array with the lengths of the names array and I loop through it to add the length of the names to nameLengths array
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			
		}
		
		System.out.println("Lengths of names: ");
		for (int length : nameLengths) {
			System.out.println(length + " ");
		}
			
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("------------------------------------------------------------------");	
		System.out.println("6.");
		
		int sumOfElements = 0;
		
			for (int lengths : nameLengths) {
				sumOfElements += lengths;
			}
				System.out.println("Sum of name lengths: " + sumOfElements);
			
			
		System.out.println("------------------------------------------------------------------");
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("7.");
		//Here I declare the variables word and n, I then call the method. The method is all the way at the bottom of this project.
		String word = "Hello";
		int n = 4;
		
		String answer1 = wordCounter(word, n);
		System.out.println(answer1);
		
		

		
		
		
		System.out.println("------------------------------------------------------------------");
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
		
		//public static String fullName(String firstName + " " + String lastName) {
		//return firstName + " " + lastName;
	//}
		
		
		
		
//----------------------------------------------------------------------------------------------------------------------------------		
	}// End of main
	//7. Method
	//  Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	public static String wordCounter(String word, int n) {
		if (n <= 0) {
			//return "";
		}
		
		String answer1 = word;
		for (int i =1; i < n; i++) {
			answer1 += word;
		}
		
		return answer1; 
			
	}//End of wordCounter method
	
	//8.Method
	// Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	} //End of fullName method
	
	
	//9.
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	//Here I name the method sumOfInts and make it an int array
	public static boolean sumOfInts(int[] arr) {
		int sum = 0;
		
		//Here I add all the elements in the array
		for (int num : arr) {
			sum += num;
		}
		//Here I check if the sum is grater than 100
		return sum > 100;
		
	} //End of sumOfInts method
	
	
	//10.
	// Write a method that takes an array of double and returns the average of all the elements in the array.
	
	//Here I declare the method
	public static double numberAverage(double[] arr) {
		
		double sum = 0;
		//Here I add the elements in the array
		for (double num : arr) {
			sum += num; 
		}
		//Here I calculate the average and return it
		double average = sum / arr.length;
		return average;
	} //End of numberAverage
	
	//11.
	// Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	//Here I make the method and call it twoArrays
	public static boolean twoArrays(double[] num1, double[] num2) {
		
		//Here I calculate the average of the first array
		double sumNum1 = 0;
		for (double num : num1) {
			sumNum1 += num;
	}
		double average1 = sumNum1 / num1.length;
		
		//Here I calculate the average of the second array
		double sumNum2 = 0;
		for (double num : num2) {
			sumNum2 += num;
		}
		double average2 = sumNum2 / num2.length;
		
		//Here I return the average of the first set if it is grater than the second
		return average1 > average2;
		
	} // End of twoArrays method
	
	//12.
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	//I wrote the method and in the return statement is the "equation" of the two variables making sure they are both true so that the method returns true
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	
	} //End of willBuyDrink
	
	//13.
	// Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	
	//Here I created a boolean method that returns true if both variables are true.
	public static boolean willGoSwiming(boolean isNotCloudy, int outsideTemp) {
		return isNotCloudy && outsideTemp > 85;
		
	} //End of willGoSwimming
	
	
	
} //End of class
