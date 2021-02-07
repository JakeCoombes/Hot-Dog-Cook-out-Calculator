/* 
 * Jake Coombes
 * 9/21/2018
 * Hot Dog Cook-out Calculator HW:
 * 		This code gets the amount of people and how many hot 
 * 		dogs each person gets. Then calculates how many packages 
 * 		or hot dogs and hot dog buns the user will need to buy.
 * 		after that it will display the everything and the amount 
 * 		of left over hot dog buns and hot dogs the user will have.
 */

import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class HotDogCookoutCalculator
{

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in); //allows the code to get reading from user 
		
		//declare constant values
		final int dogsPerPackage = 10;
		final int bunsPerPackage = 8;
		
		//declare variables
		int reqDogs, reqDogPackages, reqBunPackages, extraDogs, extraBuns;
		
		// get the user input 
		System.out.println("How many people are attending your cookout?");
		int people = reader.nextInt();
		
		System.out.println("How many hotdogs will each person get?");
		int personalDogs = reader.nextInt();
		
		//calculate the total consumed dogs/buns and the total amount of packages needed
		reqDogs = people * personalDogs;
		
		//calculate the amount of required dog packages
		reqDogPackages = reqDogs / dogsPerPackage;
		if (reqDogs % dogsPerPackage != 0)	reqDogPackages++;
		
		//calculate the amount of required  bun packages
		reqBunPackages = reqDogs / bunsPerPackage;
		if (reqDogs % bunsPerPackage !=0)	reqBunPackages++;
		
		//calculate the amount of extra dogs
		extraDogs = reqDogPackages * dogsPerPackage - reqDogs;
		
		//calculate the amount of extra buns
		extraBuns = reqBunPackages * bunsPerPackage - reqDogs;
		
		System.out.println("Hotdog Packages: " + reqDogPackages);
		System.out.println("Bun Packages   : " + reqBunPackages);
		System.out.println("Extra Hotdogs  : " + extraDogs);
		System.out.println("Extra Buns     : " + extraBuns);
	}

}
