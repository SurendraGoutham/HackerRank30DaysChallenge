package hackerRank.Inheritance;

class Grade extends Student {
	private int score;

	Grade(String firstName, String lastName, int phone, int score) {
		super(firstName, lastName, phone);
		this.score = score;
	}

	char calculate() {
		char grade = 'D';
		if (score < 40)
			grade = 'D';
		else if (score >= 40 && score < 60)
			grade = 'B';
		else if (score >= 60 && score < 75)
			grade = 'A';
		else if (score >= 75 && score < 90)
			grade = 'E';
		else if (score >= 90 && score <= 100)
			grade = 'O';
		return grade;
	}
}
