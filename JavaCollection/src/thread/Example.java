package thread;

public class Example {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("let us find current thread");
		Thread t=Thread.currentThread();
		System.out.println("current thread= "+t);
		System.out.println("its name= "+t.getName());

	}

}
