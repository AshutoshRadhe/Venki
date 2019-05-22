package thread;

public class Demo1 {

	public static void main(String[] args) {
		
		MyClass obj=new MyClass();
		Thread t=new Thread(obj);
		t.start();

	}

}
