
/**
 * A class that stores information about crimes and progression.
 */
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

    // Getters
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

    // Setters
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

    /**
     * A method to display crime progression.
     */
    public void display() {
        System.out.println("Type of crime:" +crimeType);
        System.out.println("Number of crimes completed:" +crimesCompleted);
        System.out.println("Number of crimes required to complete:" +crimesRequired);
        System.out.println("Cash rewards:"+cashReward);
    }

    /**
     * A method to check if all crimes within an objective have been complete
     * @param crimeType
     */
    public boolean complete(String crimeType) {
        return crimesCompleted == crimesRequired;
    }

    /**
     * A method that updates the number of crimes committed, if fully complete
     * display a message that says so.
     */
    public void updateCrime(String crimeType){
        if(complete(crimeType)) {
            System.out.println("Crimes fully completed!");

        } else {
            crimesCompleted++;
            System.out.println(+crimesCompleted+"completed crimes out of" +crimesRequired+ "required, keep doing bad things!");
        }
    }

    /**
     * A method to collect cash rewards if all crimes in an objective are complete
     */
    public void collectReward(String crimeType) {
        if (complete(crimeType)) {
            System.out.print("Collect your cash reward of $" +cashReward);
        } else {
            System.out.println("You must commit all crimes before you are able to collect $" + cashReward);
        }
    }



}