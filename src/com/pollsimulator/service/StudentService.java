package com.pollsimulator.service;

import java.util.ArrayList;
import java.util.List;

import com.pollsimulator.model.Student;

public class StudentService {
private static List<Student> voterList = new ArrayList<Student>();
	
	public static boolean regiserVote(Student s) {
		for (Student student : voterList) {
			if(student.getId() == s.getId()) {
				return false;
			}
		}
		voterList.add(s);
		for (Student student : voterList) {
			System.out.println(student.getId());
		}
		return true;
	}
}
