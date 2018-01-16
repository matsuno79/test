package jp.co.internous.action;

public class Human {
	public static void main(String[] args){

		//オブジェクト化する。定義したクラスHumanNameの変数を作る。
		//new使ってメモリ確保している。理由は、変数abcに参照先を作成するため。
		HumanName abc = new HumanName();
		System.out.println(abc.getName());

		HumanAge egf = new HumanAge();
		System.out.println(egf.getAge());

		HumanAddress hij = new HumanAddress();
		System.out.println(hij.getAddress());

	}
}
