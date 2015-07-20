package ElectronicVotingMachine;

public class Candidate {
	String CandidateName;
	int votes;

	Candidate(String name){
		CandidateName = name;
		votes = 0;
	}
	
	public void getCandidate(){
		System.out.println(CandidateName);
	}
}
