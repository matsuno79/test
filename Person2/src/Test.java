
public class Test {
	public static void main(String[] args){

		/*
		Person wago = new Person();
		Person haru = new Person();

		wago.name="和合真一";
		wago.age=31;
		System.out.println(wago.name);
		System.out.println(wago.age);
		wago.talk();

		haru.name="春風";
		haru.age=16;
		System.out.println(haru.name);
		System.out.println(haru.age);
		haru.run();



		Person naka = new Person("atsuhiko",35);
		System.out.println(naka.name);
		System.out.println(naka.age);*/

		/*

		Robot aibo = new Robot();
		Robot asimo = new Robot();
		Robot pep = new Robot();
		Robot dora = new Robot();

		aibo.name = "aibo";
		asimo.name = "asimo";
		pep.name = "pepper";
		dora.name = "doraemon";

		aibo.talk();
		asimo.run();
		pep.walk();
		dora.talk();*/

		/*コンストラクタ3番目*/
		Person sa = new Person("saburo");
		System.out.println(sa.name);
		System.out.println(sa.age);

		/*コンストラクタ4番目*/
		Person si = new Person(25);
		System.out.println(si.name);
		System.out.println(si.age);

		/*コンストラクタ5番目*/
		Person go = new Person(17,"hanako");
		System.out.println(go.name);
		System.out.println(go.age);

	}

}
