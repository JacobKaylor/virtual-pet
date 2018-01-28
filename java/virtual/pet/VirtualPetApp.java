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
		System.out.println("waste level: " + lion.getWaste());
		System.out.println("If any of Lola's level get to 0 or 100 she dies.");
		System.out.println("What would you like to do?");

		while (lion.getHunger() < 100 && lion.getThirst() < 100 && lion.getBoredom() < 100 && lion.getWaste() < 100
				&& lion.getHunger() > 0 && lion.getThirst() > 0 && lion.getBoredom() > 0 && lion.getWaste() > 0) {
			System.out.println("Press 1 to feed, 2 to water, 3 to play, 4 to let it out to the bathroom");
			String response = input.nextLine();
			lion.tick();
			if (response.equals("1")) {

				lion.feed(20);
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
				System.out.println("Your lions new waste level: " + lion.getWaste());
			} else if (response.equals("2")) {

				lion.water(20);
				System.out.println("You're lion's new hunger level: " + lion.getHunger());
				System.out.println("You're lion's new thirst level: " + lion.getThirst());
				System.out.println("You're lion's new boredom level: " + lion.getBoredom());
				System.out.println("Your lions new waste level: " + lion.getWaste());
			} else if (response.equals("3")) {

				lion.play(13);
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
				System.out.println("Your lions new waste level: " + lion.getWaste());
			} else if (response.equals("4")) {

				lion.waste(13);
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
				System.out.println("Your lions new waste level: " + lion.getWaste());
			} else {
				System.out.println("You have entered an invalid number and Lola's levels are increasing...");
				System.out.println("Your lions new hunger level: " + lion.getHunger());
				System.out.println("Your lions new thirst level: " + lion.getThirst());
				System.out.println("Your lions new boredom level: " + lion.getBoredom());
				System.out.println("Your lions new waste level: " + lion.getWaste());
			}

		}
		System.out.println("\nSorry, you have let Lola die :( ");
		input.close();

	}
}
