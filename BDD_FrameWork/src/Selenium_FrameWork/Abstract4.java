package Selenium_FrameWork;

public class Abstract4 extends Abstract3 {

	@Override
	public void a() {
		System.out.println("Hello a");

	}

	@Override
	public void b() {
		System.out.println("Hello b");

	}

	@Override
	public void c() {
		System.out.println("Hello c");

	}

	@Override
	public void d() {
		System.out.println("Hello d");

	}

	public static void main(String[] args) {
		Abstract4 ab4 = new Abstract4();
		ab4.a();
		ab4.b();
		ab4.c();
		ab4.d();
	}

}
