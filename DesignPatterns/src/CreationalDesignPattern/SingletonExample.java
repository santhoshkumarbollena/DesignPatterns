package CreationalDesignPattern;

public class SingletonExample {
	private SingletonExample() {
		
	}
	private static SingletonExample instance=null;
	public static SingletonExample GetInstance() {
		if(instance==null) {
			instance =new SingletonExample();
		}
		return instance;
	}
	public void display() {
		System.out.println("this is singleton example");
		System.out.println("this exmple will only create single instance for all the process");
	}

}
