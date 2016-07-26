package edu.practice;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private Properties studentInfo;
	private Set<String> electives;
	private List<String> activities;
	private Map<String,Integer> score;
		
	public Properties getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(Properties studentInfo) {
		this.studentInfo = studentInfo;
	}
	public Set<String> getElectives() {
		return electives;
	}
	public void setElectives(Set<String> electives) {
		this.electives = electives;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	public Map<String, Integer> getScore() {
		return score;
	}
	public void setScore(Map<String, Integer> score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [studentInfo=" + studentInfo + ", electives=" + electives + ", activities=" + activities
				+ ", score=" + score + "]";
	}
}
