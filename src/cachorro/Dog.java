package cachorro;

public class Dog implements Animal{
	@Override
	public void MakeSound() {
		barck();
	}

	public void barck() {
		System.out.println("Au Au!");
	}
}
