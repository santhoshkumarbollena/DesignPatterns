package CreationalDesignPattern.AbstractFactoryPattern;

public class GettingAbstractFactory {
	public static AbstarctDesignPattern getChoicebetweenColorNadShape(String choice) {
		if(choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		}
		else if(choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}

}
