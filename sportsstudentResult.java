package linaa;
interface student{
	int score = 10;
	void displayScore();
}
interface sports{
	int score=25;
	
}
class Result implements student,sports{
	public void displayScore() {
		System.out.println("Academic score is:" + student.score);
	}
	public void displaysportsscore() {
		System.out.println("Sports score is:" + sports.score);
	}
}
public class sportsstudentResult {
	public static void main(String[] args) {
		Result r= new Result();
		r.displayScore();
		r.displaysportsscore();
	}

}
