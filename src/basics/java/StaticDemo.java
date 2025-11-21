package basics.java;

public class StaticDemo {
	static int count;
	static {
		count=20;
		System.out.println("Shows the static counnt assigned:"+count);
	}
	static void show() {
		System.out.println("methods rubs inn static assigned:"+count);
	}
	public static void main(String [] args0) {
		System.out.println("static in main method:"+count);
		show();
	}
}
