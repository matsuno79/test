import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("入力してください");
			String s = br.readLine();
			System.out.println(s);
	}

}
