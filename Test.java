

public class Test {

	public static void main(String args[]) {
		test1();
		System.out.println();
		System.out.println();
		System.out.println();
		test2();
	}

	private static void test1() {
		System.out.println("test1 begin");
		CJCSeriousRandom r = CJCSeriousRandom.create(1, 3);
		for (int i = 0; i < 20; i++) {
			System.out.println(r.nextInt());
		}
		System.out.println("test1 end");
	}

	private static void test2() {
		System.out.println("test2 begin");
		CJCSeriousRandom r = CJCSeriousRandom.create(-1, 3);
		for (int i = 0; i < 40; i++) {
			System.out.println(r.nextInt());
		}
		System.out.println("test2 end");
	}
}
