
public class ObjTest {

	public static void main(String[] args){
		Sub s = new Sub();

		Cp wago = new Cp("和合真一",31);
		System.out.println(wago.getName());
		System.out.println(wago.getAge());

		s.M();
		s.C();
		s.play1();
		s.call();
		s.A();

	}
}