package simUDuckPadraoStrategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
	
		Duck mallard = new MallardDuck();
		mallard.perfomFly();
		mallard.perfomQuack();
		
		Duck model = new ModelDuck();
		model.perfomFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.perfomFly();
	}

}
