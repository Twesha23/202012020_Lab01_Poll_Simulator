package com.pollsimulator.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.pollsimulator.model.Candidate;

public class CandidateService {
private static List<Candidate> candidateList = new ArrayList<Candidate>();
	
	public static boolean register(Candidate c) {
		for (Candidate candidate : candidateList) {
			if(candidate.getId() == c.getId()) {
				return false;
			}
		}
		c.setVote_count(0);
		candidateList.add(c);
		for (Candidate candidate : candidateList) {
			System.out.println(candidate.getId()+" "+ candidate.getName() + " " + candidate.getVote_count());
		}
		return true;
	}
	
	public static List<Candidate> getCandidates() {
		return candidateList;
	}

	public static void registerVote(long cid) {
		for (Candidate candidate : candidateList) {
			if(candidate.getId() == cid) {
				candidate.setVote_count(candidate.getVote_count()+1);
				return;
			}
		}
	}
	
	public static List<Candidate> getPollResult () {
		List<Candidate> result = new ArrayList<Candidate>(2);
		Collections.sort(candidateList);
		if(candidateList.size()==2) {
		result.add(candidateList.get(0));
		result.add(candidateList.get(1));
		}
		return result;
	}
	
	
}
