import sheffield.*;

public class Assignment1{
	public static void main (String[] args){

		// FIRST TASK

		//Defining reader and writer
		EasyReader keyboard = new EasyReader();
		EasyWriter writer = new EasyWriter();

		//Inputting values in pounds by the user
		int pounds = keyboard.readInt("Please type in a weight in pounds : ");

		//Defining Constants
		double POUNDS_TO_KG = 0.453592;

		//Printing output values
		writer.print ("That is ");
		writer.print((pounds * POUNDS_TO_KG),3);
		writer.println(" kilograms\n");


		// SECOND TASK

		//Defining new reader to read from file "planets.txt"
		EasyReader fileInput = new EasyReader("planets.txt");

		//Reading and writing output from text file
		String text1 = fileInput.readString();
		writer.println(text1);

		//Printing First output in Task 2
		writer.print(pounds);
		writer.print(" pounds on Earth weighs ");
		writer.print((pounds * POUNDS_TO_KG), 4);
		writer.println(" kilograms");

		//Collecting value of gravity from sentence in text file
		int index_of_is = text1.indexOf("is");
		String gravity = text1.substring(index_of_is + 3 , index_of_is + 7);
 		double g1 = Double.valueOf(gravity);

		//Defining planet variable, to read planet from text file
 		String planet = text1.substring (0,text1.indexOf ("'s"));

		//Printing Second output in Task 2
		writer.print(pounds);
		writer.print(" pounds on " + planet + " weighs ");
		writer.print(g1 * (pounds * POUNDS_TO_KG),4);
		writer.println(" kilograms\n");


		// THIRD TASK

		//Reading second sentence from textfile
		String text2 = fileInput.readString();

		//Printing first line of output - Earth
		writer.print("Earth");
		writer.println(1 * POUNDS_TO_KG * pounds, 2, 15);

		//Printing second line of output - Planet1

		//Printing planet name
		String planet1 = text1.substring (0,text1.indexOf("'s"));
		writer.print(planet1);
		//Printing gravity on planet
		gravity = text1.substring(index_of_is + 3 , index_of_is + 7);
		g1 = Double.valueOf(gravity);
		writer.println(g1 * POUNDS_TO_KG * pounds, 2, 20 - planet1.length());

		//Printing third line of output - Planet2
		
		//Printing planet name
		String planet2 = text2.substring (0,text2.indexOf("'s"));
		writer.print(planet2);
		//Printing gravity on planet
		gravity = text2.substring(index_of_is + 3 , index_of_is + 7);
		double g2 = Double.valueOf(gravity);
		writer.println(g2 * POUNDS_TO_KG * pounds, 2, 20 - planet2.length());


	}
}
