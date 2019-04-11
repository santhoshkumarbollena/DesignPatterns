package CreationalDesignPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryDesignPattern.Blue;
import CreationalDesignPattern.FactoryDesignPattern.Color;
import CreationalDesignPattern.FactoryDesignPattern.Red;
import CreationalDesignPattern.FactoryDesignPattern.Shape;

public class ColorFactory extends AbstarctDesignPattern{
	public Shape getShape(String ShapeName) {
		return null;
	}
	public Color getColor(String colorName) {
		if(colorName==null) {
			return null;
		}
		if(colorName.equals("Red")) {
			return new Red();
		}
		else if(colorName.equals("Blue")) {
			return new Blue();
		}
		return null;
	}

}
