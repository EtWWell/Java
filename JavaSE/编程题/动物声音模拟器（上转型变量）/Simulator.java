class Simulator{
	void playSound(Animal animal){
		animal.cry();
		System.out.println(animal.getAnimalName());
	}
}