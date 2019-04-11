package CreationalDesignPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryDesignPattern.Color;
import CreationalDesignPattern.FactoryDesignPattern.Rectangle;
import CreationalDesignPattern.FactoryDesignPattern.Shape;
import CreationalDesignPattern.FactoryDesignPattern.Square;

public class ShapeFactory extends AbstarctDesignPattern{
	public Shape getShape(String ShapeName) {
		if(ShapeName==null) {
			return null;
		}
		if(ShapeName.equals("Rectangle")) {
			return new Rectangle();
		}
		else if(ShapeName.equals("Square")) {
			return new Square();
		}
		return null;
	}
	public Color getColor(String colorName) {
	
		return null;
	}

}
