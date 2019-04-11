package CreationalDesignPattern.FactoryDesignPattern;

public class FactoryPatternForShape {
	public Shape getShape(String shapeName) {
		if(shapeName==null) {
			return null;
		}
		if(shapeName.equals("Rectangle")) {
			return new Rectangle();
		}
		else if(shapeName.equals("Square")) {
			return new Square();
		}
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
