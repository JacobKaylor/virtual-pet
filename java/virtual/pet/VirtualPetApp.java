package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet lion = new VirtualPet();

		System.out.println("Your new pet Lola the Lion is ready to be cared for!");
		System.out.println("Here is the current state of your lion:");
		System.out.println("hunger level: " + lion.getHunger());
		System.out.println("thirst level: " + lion.getThirst());
		System.out.println("boredom level: " + lion.getBoredom());
		System.out.println("If any of Lola's level get to 0 or 100 she dies.");
		System.out.println("What would you like to do?");

		while (lion.getHunger() < 100 && lion.getThirst() < 100 && lion.getBoredom() < 100 && lion.getHunger() > 0
				&& lion.getThirst() > 0 && lion.getBoredom() > 0) {
			System.out.println("Press 1 to feed, 2 to water, 3 to play");
			String response = input.nextLine();
			lion.tick();
			if (response.equals("1")) {

				lion.feed(15);
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
			} else if (response.equals("2")) {

				lion.water(15);
				System.out.println("You're lion's new hunger level: " + lion.getHunger());
				System.out.println("You're lion's new thirst level: " + lion.getThirst());
				System.out.println("You're lion's new boredom level: " + lion.getBoredom());
			} else if (response.equals("3")) {

				lion.play(10);
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
			} else {
				System.out.println("You have entered an invalid number and Lola's levels are dwindling...");
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
			}

		}
		System.out.println("\nSorry, you have let Lola die :( ");

	}
}
