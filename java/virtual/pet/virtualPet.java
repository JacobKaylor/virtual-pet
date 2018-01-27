package virtual.pet;

public class VirtualPet {
	private int hunger = 50;
	private int thirst = 50;
	private int boredom = 50;
	
	public void tick() {
		hunger +=6;
		thirst +=3;
		boredom +=3;
	}
	public VirtualPet() {
		
	}
	public int getHunger() {
		
		return hunger;
	}
	public int getThirst() {
		return thirst;
	}
	public int getBoredom() {
		return boredom;
	}
	public void feed(int food) {
	hunger -= food;
	thirst +=5;
	}
	
	public void water(int drink) {
		thirst -= drink;
	}
	public void play(int run) {
		 boredom -= run;
	}



	

}
