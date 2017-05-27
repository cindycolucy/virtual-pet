import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet cat = new VirtualPet();

		// Input pet's name
		writeLine("Input your cat's name.");
		cat.name = input.nextLine();

		// While loop, while the cat is not dead
		while (!cat.dead()) {

			// Lame graphic of a cat
			writeLine(" = ^. .^ =");
			writeLine("   | w | ");

			// Cat's status
			writeLine("Current State of " + cat.name + ":");
			writeLine("Hunger: " + cat.getHunger());
			writeLine("Thirst: " + cat.getThirst());
			writeLine("Boredom: " + cat.getBoredom());

			// If statement to feed himself
			if (cat.hunger > 50) {
				cat.feedSelf();
				writeLine(cat.name + " fed himself.");
			}
			// Else if water himself
			else if (cat.thirst > 50) {
				cat.waterSelf();
				writeLine(cat.name + " watered himself.");
			}
			// Else if play with himself
			else if (cat.boredom > 50) {
				cat.playSelf();
				writeLine(cat.name + " played with himself.");// (-:
			}

			else {
				// User input requested
				writeLine("What do you want to do?");
				writeLine("Enter 1 to feed, enter 2 to water, 3 to play or 4 to quit");

				String activity = input.next();

				// Switch/case for different types of user input
				// You get a message to do something each time you choose an
				// activity
				switch (activity) {
				case "1":
					writeLine("What do you want to feed " + cat.name + "?");
					writeLine("Enter \"fish\" or \"chicken\".");

					String foodType = input.next();

					//Switch case for type of food
					switch (foodType) {
					case "fish":
						cat.feedFish();
						writeLine ("You fed " + cat.name + " fish.");
						break;
					case "chicken":
						cat.feedChicken();
						writeLine ("You fed " + cat.name + " chicken.");
						break;
					}
					//Case to water the pet
					case "2":
						cat.water();
						if (cat.isHungry()) {
							writeLine("Feed " + cat.name + "!");
						} else {
							writeLine(cat.name + " is not hungry right now.");
						}
						if (cat.isThirsty()) {
							writeLine("Water " + cat.name + "!");
						} else {
							writeLine(cat.name + " is not thirsty right now.");
						}
						if (cat.isBored()) {
							writeLine("Play with " + cat.name + "!");
						} else {
							writeLine(cat.name + " is not bored right now.");
						}
						break;
					//Case to play with cat
					case "3":
						cat.play();
						if (cat.isHungry()) {
							writeLine("Feed " + cat.name + "!");
						} else {
							writeLine(cat.name + " is not hungry right now.");
						}
						if (cat.isThirsty()) {
							writeLine("Water " + cat.name + "!");
						} else {
							writeLine(cat.name + " is not thirsty right now.");
						}
						if (cat.isBored()) {
							writeLine("Play with " + cat.name + "!");
						} else {
							writeLine(cat.name + " is not bored right now.");
						}
						break;
					// Quit case, option to quit
					case "4":
						writeLine("Poor " + cat.name + "!");
						cat.quit();

					}
					// Tick to indicate passage of time
					cat.tick();
				}
				// If the cat dies, lame graphic of dead cat
				if (cat.dead()) {
					writeLine(cat.name + " is dead!!!");
					writeLine(" = ^x x^ =");
					writeLine("   | w | ");
				}
			}
		}


	//Method to write line
	public static void writeLine(String message) {
		System.out.println(message);
	}
}
