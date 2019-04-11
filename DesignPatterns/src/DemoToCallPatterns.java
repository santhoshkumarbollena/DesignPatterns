import CreationalDesignPattern.SingletonExample;
import CreationalDesignPattern.FactoryDesignPattern.Color;
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
		FactoryPatternForShape type=new FactoryPatternForShape();
		Shape shape1=type.getShape("Rectangle");
		shape1.draw();
		Shape shape2=type.getShape("Square");
		shape2.draw();
		
		Color color1=type.getColor("Red");
		color1.fill();
		Color color2=type.getColor("Blue");
		color2.fill();
		
	}

}
