package com.app.calc;

public class StudentScore {
	private IDatabase database;

	public StudentScore(IDatabase database) {
		super();
		this.database = database;
	}
	
	public void calculateAndStore(String sid, int[] scores) {
		int total = 0;
		for(int score: scores) {
			total = total + score;
		}
		database.updateScore(sid, total);
	}

}
