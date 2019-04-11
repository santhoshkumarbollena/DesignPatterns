package CreationalDesignPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryDesignPattern.Color;
import CreationalDesignPattern.FactoryDesignPattern.Shape;

public abstract class AbstarctDesignPattern {
	abstract public Color getColor(String colorName);
	abstract public Shape getShape(String ShapeName);

}
