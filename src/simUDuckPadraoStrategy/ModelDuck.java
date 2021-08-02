package simUDuckPadraoStrategy;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flybehavior = new FlyNoWay();
		quackbehavior = new Quack();
	}
	
	public void display()
	{
		System.out.println("Eu sou um modelo de pato");
	}
	
}
