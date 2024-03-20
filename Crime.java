public class Crime {
    private String crimeType;
    private int crimesCompleted;
    private int crimesRequired;
    private int cashReward;

    public Crime() {
        crimeType = "";
        crimesCompleted = 0;
        crimesRequired = 0;
        cashReward = 0;
    }
    public String getCrimeType(){
        return crimeType;
    }

    public int getCrimesCompleted() {
        return crimesCompleted;
    }

    public int getCrimesRequired() {
        return crimesRequired;
    }

    public int getCashReward() {
        return cashReward;
    }

    public void setCrimeType(String crimeType){
        this.crimeType = crimeType;
    }

    public void setCrimesCompleted(int crimesCompleted) {
        this.crimesCompleted = crimesCompleted;
    }

    public void setCrimesRequired(int crimesRequired) {
        this.crimesRequired = crimesRequired;
    }

    public void setCashReward(int cashReward) {
        this.cashReward = cashReward;
    }

    public void display() {
        System.out.println("Type of crime:" +crimeType);
        System.out.println("Number of crimes completed:" +crimesCompleted);
        System.out.println("Number of crimes required to complete:" +crimesRequired);
        System.out.println("Cash rewards:"+cashReward);
    }

    public boolean complete() {
        return crimesCompleted == crimesRequired;
    }
    public void updateCrime(){
        if(complete()) {
            System.out.println("Crimes fully completed!");

        } else {
            crimesCompleted++;
            System.out.println(+crimesCompleted+"completed crimes out of" +crimesRequired+ "required, keep doing bad things!");
        }
    }

    public void collectReward() {
        if (complete()) {
            System.out.print("Collect your cash reward of $" +cashReward);
        } else {
            System.out.println("You must commit all crimes before you are able to collect $" + cashReward);
        }
    }


}
