
public class Student {
	String name;
	int score;
	static final int MAX_SCORE = 100;


	Student(String argName,int argScore){
		name = argName;
		score = argScore;
	}

	Student(String argName){
		name = argName;
	}



void printScore() {
	System.out.println(name+"さんは"+MAX_SCORE+"点満点中"+score+"点です");
}


}
