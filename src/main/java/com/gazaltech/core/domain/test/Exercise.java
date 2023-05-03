package com.gazaltech.core.domain.test;

import java.sql.Blob;
import java.util.List;

import lombok.Getter;

@Getter
public class Exercise {
	private Blob question;
	private List<String> answers;
	private List<String> trueAnswers;
	private List<String> selectedAnswer;
	private Boolean isFinish;
	
	public Exercise(Blob question, List<String> answers, List<String> trueAnswers) {
		super();
		this.question = question;
		this.answers = answers;
		this.trueAnswers = trueAnswers;
		this.isFinish = false;
	}
	
	public List<String> getTrueAnswers() {
		if (getIsFinish().booleanValue() == false) {
			return List.of();
		}
		
		return this.trueAnswers;
	}
	
	public Integer getTrueAnswerSelected() {
		if (getIsFinish().booleanValue() == false) {
			return Integer.valueOf(0);
		}
		
		int trueAnswerSelected = (int) this.selectedAnswer.stream()
		.map(answer -> this.trueAnswers
				.stream()
				.anyMatch(trueAnswer -> trueAnswer.contains(answer)))
		.count();
		
		return Integer.valueOf(trueAnswerSelected);
	}
}
