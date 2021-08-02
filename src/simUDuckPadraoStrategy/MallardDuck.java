package simUDuckPadraoStrategy;

public class MallardDuck extends Duck{
	
	public MallardDuck()
	{
		quackbehavior = new Quack();
		flybehavior = new FlyWithWings();
	}

	public void display() {	
		System.out.println("Eu sou um pato mallard real");
	}
}
