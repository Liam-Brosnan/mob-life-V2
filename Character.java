import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;


public class Character {
    private String userName;
    private String hair;
    private String eyebrows;
    private String eyes;
    private String nose;
    private String mouth;
    private Dictionary<String, String> clothes;
    private Dictionary<String, String> accessories;
    private int level;
    private double cashMoney;
    private double experiencePoints;
    private double stamina;
    private double maxStamina;
    private double nerve;
    private double maxNerve;
    private double muscle;
    private double maxMuscle;
    private double health;
    private double maxHealth;
    private String status;



    public Character() {
        userName = "Default";
        hair = "hair1_black";
        eyebrows = "brow1_black";
        eyes = "eye1_brown";
        nose = "nose1";
        mouth = "mouth1";

        // Initialise default clothing
        clothes = new Hashtable<>(); {
            clothes.put("upper", "tshirt_1");
            clothes.put("lower", "jeans_1");
            clothes.put("shoes", "airmax_95");
        }

        // Initialise default accessories
        accessories = new Hashtable<>(); {
            accessories.put("hat", "snapback_1");
            accessories.put("glasses", "sunglasses_1");
            accessories.put("gloves", "bare");
        }

        level = 1;
        cashMoney = 0;
        experiencePoints = 0;
        stamina = 30;
        maxStamina = 30;
        nerve = 20;
        maxNerve = 20;
        muscle = 20;
        maxMuscle = 20;
        health = 30;
        maxHealth = 30;
        status = "Initiate";

    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public String getHair() {
        return hair;
    }

    public String getEyebrows() {
        return eyebrows;
    }

    public String getEyes() {
        return eyes;
    }

    public String getNose() {
        return nose;
    }

    public String getMouth() {
        return mouth;
    }

    public Dictionary<String, String> getClothes() {
        return clothes;
    }

    public Dictionary<String, String> getAccessories() {
        return accessories;
    }

    public int getLevel() {
        return level;
    }

    public double getCashMoney() {
        return cashMoney;
    }

    public double getExperiencePoints() {
        return experiencePoints;
    }

    public double getStamina() {
        return stamina;
    }

    public double getMaxStamina() {
        return maxStamina;
    }

    public double getNerve() {
        return nerve;
    }

    public double getMaxNerve() {
        return maxNerve;
    }

    public double getMuscle() {
        return muscle;
    }

    public double getMaxMuscle() {
        return maxMuscle;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public String getStatus() {
        return status;
    }


    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setEyebrows(String eyebrows) {
        this.eyebrows = eyebrows;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCashMoney(double cashMoney) {
        this.cashMoney = cashMoney;
    }

    public void setExperiencePoints(double experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public void setMaxStamina(double maxStamina) {
        this.maxStamina = maxStamina;
    }

    public void setNerve(double nerve) {
        this.nerve = nerve;
    }

    public void setMaxNerve(double maxNerve) {
        this.maxNerve = maxNerve;
    }

    public void setMuscle(double muscle) {
        this.muscle = muscle;
    }

    public void setMaxMuscle(double maxMuscle) {
        this.maxMuscle = maxMuscle;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Further functionality

    /**
     * Function to update a clothing type in clothing dictionary
     * @param type
     * @param clothingID
     */
    public void changeClothing(String type, String clothingID) {
        clothes.put(type, clothingID); // Need to add error catching for inputting keys not within dictionary
        System.out.print("New clothing: " + getClothes());
    }

    /**
     * Function to update accessory type in accessory dictionary
     * @param type
     * @param accessoryID
     */
    public void changeAccessories(String type, String accessoryID) {
        accessories.put(type, accessoryID);  // Need to add error catching for inputting keys not within dictionary
        System.out.print("New accessories: " + getAccessories());
    }
}