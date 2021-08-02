package simUDuckPadraoStrategy;

public abstract class Duck {
	// variaveis de referencia
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	
	// Construtor
	public Duck()
	{
		
	}
	
	public abstract void display();
	
	public void perfomFly()
	{
		flybehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb)
	{
		flybehavior = fb;
	}
	
	public void perfomQuack()
	{
		quackbehavior.quack();
	}
	
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackbehavior = qb;
	}
	
	public void swim()
	{
		System.out.println("Todos patos voam!");
	}
}
