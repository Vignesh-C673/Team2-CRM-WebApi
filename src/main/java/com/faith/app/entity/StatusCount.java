package com.faith.app.entity;

public class StatusCount {

	int statId;
	long count;

	//Default constructor
	public StatusCount() {
		super();
		
	}
		

	//Parameterized constructor
	public StatusCount(int statId, long count) {
		super();
		this.statId = statId;
		this.count = count;
	}
	
	
    //Getters and setters
	public int getStatId() {
		return statId;
	}

	public void setStatId(int statId) {
		this.statId = statId;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "StatusCount [statId=" + statId + ", count=" + count + "]";
	}

}