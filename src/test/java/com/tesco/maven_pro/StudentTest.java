package com.tesco.maven_pro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.app.calc.IDatabase;
import com.app.calc.StudentScore;

public class StudentTest {
	
	@Mock
	public IDatabase database;
	
	public StudentScore score;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testScore() {
		score = new StudentScore(database);
		int[] scores = {60, 70, 90};
		score.calculateAndStore("student1", scores);
		Mockito.verify(database).updateScore("student1", 220);
//		Mockito.verify(database, Mockito.times(1)).updateScore("student1", 220);
	}
}
