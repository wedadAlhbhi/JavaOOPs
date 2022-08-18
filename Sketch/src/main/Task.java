package main;

public class Task {
	
	String tilte;
	boolean complete;

	public Task() {
		
	}
	
	public Task(String _title) {
		this.tilte = _title.toLowerCase();
		this.complete = false;
	}
	
	@Override
	public String toString() {
		if (complete) {
			return tilte +" " + "complete";
			
		}else 
			return tilte +" " + "incomplete";
		
	}

	public void changeStatus() {
//		if (complete == true) {
//			complete = false;
//		}else {
//			complete = true;
//		}
		
		complete = !complete; // ! Negation
	}

}
