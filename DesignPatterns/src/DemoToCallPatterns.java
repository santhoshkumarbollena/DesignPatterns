import CreationalDesignPattern.SingletonExample;
import CreationalDesignPattern.AbstractFactoryPattern.AbstarctDesignPattern;
import CreationalDesignPattern.AbstractFactoryPattern.GettingAbstractFactory;
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
		CallingAbstractDesignPatters();
	}
	public static void CallingAbstractDesignPatters() {
		AbstarctDesignPattern factoryType=GettingAbstractFactory.getChoicebetweenColorNadShape("shape");
		Shape shape1=factoryType.getShape("Rectangle");
		shape1.draw();
		AbstarctDesignPattern factoryType2=GettingAbstractFactory.getChoicebetweenColorNadShape("color");
		Color color1=factoryType2.getColor("Blue");
		color1.fill();
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
