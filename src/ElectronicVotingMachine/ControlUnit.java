package ElectronicVotingMachine;

import java.util.ArrayList;

public class ControlUnit {
	BallotingUnit BU;
	
	ControlUnit(){
		BU = new BallotingUnit();
	}
	
	
	ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
	public void addCandidates(ArrayList<Candidate> candidates){
		this.candidates = candidates;
	}
	
	public void getCandidates(){
		for(int i=0;i<candidates.size();i++){
			
		}
	}
	
}
