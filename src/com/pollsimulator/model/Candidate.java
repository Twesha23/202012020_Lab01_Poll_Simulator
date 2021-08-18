package com.pollsimulator.model;

public class Candidate implements Comparable<Candidate>{
	private long id;
	private String name;
	private int vote_count;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVote_count() {
		return vote_count;
	}
	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	
	@Override
	public int compareTo(Candidate c) {
		return c.getVote_count() - this.getVote_count();
	}
}
