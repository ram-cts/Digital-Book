package com.core.student;

import java.util.List;

/**
 * Hello world!
 *
 */
public class StudentPojo {
	@Override
	public String toString() {
		return "StudentPojo [Subjects=" + Subjects + "]";
	}

	private List<String> Subjects;

	public List<String> getSubjects() {
		return Subjects;
	}

	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}

}