package version1;

public class Voters {
	
	private String votersName;
	String votersSurname;
	int votersId;
	int voterAge;
	int votersRef;
	
	public Voters(String votersName, String votersSurname, int votersId, int voterAge, int votersRef){
        this.votersName=votersName;
        this.votersSurname=votersSurname;
        this.votersId=votersId;
        this.voterAge=voterAge;
        this.votersRef = votersRef;
	}
	
	
	 public String getvotersName() {
	        return votersName;
	    }

	    public void setvotersName(String votersName) {
	        this.votersName = votersName;
	    }
	    
		 public String getvotersSurname() {
		        return votersSurname;
		    }

		    public void setvotersSurname(String votersSurname) {
		        this.votersSurname = votersSurname;
		    }

	    public int getvotersId() {
	        return votersId;
	    }

	    public void setvotersId(int votersId) {
	        this.votersId = votersId;
	    }

	    public int getvoterAge() {
	        return voterAge;
	    }

	    public void setvoterAge(int voterAge) {
	        this.voterAge = voterAge;
	    }
	    
	    public int getvotersRef() {
	        return votersRef;
	    }

	    public void setvotersRef(int votersRef) {
	        this.voterAge = votersRef;
	    }

	
	    public void printVoterInfo(){

	        System.out.println(" Voter Name: " + votersName + " "+ votersSurname + "\n Voters Id: " + votersId + "\n Age :" + voterAge + votersId + "\n Reference :" + votersRef);
	    }
}
