import CreationalDesignPattern.SingletonExample;
import CreationalDesignPattern.FactoryDesignPattern.FactoryPatternForShape;
import CreationalDesignPattern.FactoryDesignPattern.Shape;

public class DemoToCallPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling singleton design pattern
		SingletonExample.GetInstance().display();
		//Calling factory patterns
		CallingFactoryDesignPattern();
	}
	public static void CallingFactoryDesignPattern() {
		FactoryPatternForShape shapetype=new FactoryPatternForShape();
		Shape shape1=shapetype.getShape("Rectangle");
		shape1.draw();
		Shape shape2=shapetype.getShape("Square");
		shape2.draw();
	}

}
