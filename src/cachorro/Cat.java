package cachorro;

public class Cat implements Animal{
	@Override
	public void MakeSound() {
		meow();
	}

	private void meow() {
		System.out.println("Miau Miau!");
	}
}
