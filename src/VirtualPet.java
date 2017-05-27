import java.util.Random;

public class VirtualPet {

	// String for name and food type
	String name;
	String foodType;
	// Instance variables
	int hunger = 60;
	int thirst = 60;
	int boredom = 60;

	// Method to make the tick random
	Random r = new Random();

	// Quit method
	void quit() {
		System.exit(0);
	}

	// Method identifying dead
	boolean dead() {
		return hunger > 60 && thirst > 60 && boredom > 60;
	}

	// Tick method
	void tick() {
		hunger = hunger + r.nextInt(40);
		thirst = thirst + r.nextInt(40);
		boredom = boredom + r.nextInt(40);
	}

	// Hunger methods
	void feedFish() {
		hunger = hunger - 25;
	}
	
	void feedChicken() {
		hunger = hunger - 20;
		thirst = thirst + 10;
	}

	boolean isHungry() {
		return hunger >= 20;
	}

	int getHunger() {
		return hunger;
	}

	void feedSelf() {
		hunger = hunger - 10;

	}

	// Thirst methods
	void water() {
		thirst = thirst - 5;
		hunger = hunger + 5;
	}

	boolean isThirsty() {
		return thirst >= 20;
	}

	int getThirst() {
		return thirst;
	}

	void waterSelf() {
		thirst = thirst - 10;

	}

	// Boredom methods
	void play() {
		boredom = boredom - 5;
		thirst = thirst + 5;
		hunger = hunger + 5;
	}

	boolean isBored() {
		return boredom >= 20;
	}

	int getBoredom() {
		return boredom;
	}

	void playSelf() {
		boredom = boredom - 10;

	}

}
