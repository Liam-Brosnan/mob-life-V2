import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;


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
    private ArrayList<String> friendList;
    private ArrayList<String> achievements;
    private ArrayList<Crime> crimeList;



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

        friendList = new ArrayList<>();
        achievements = new ArrayList<>();
        crimeList = new ArrayList<>();

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

    public ArrayList<String> getFriendList() {
        return friendList;
    }

    public ArrayList<String> getAchievments() {
        return achievements;
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

    /**
     * A method to add friend to friends list
     * @param username
     */
    public void addFriend(String username) {
        friendList.add(username);
    }

    /**
     * A method to add a crime to a characters crime list
     * @param crime
     */
    public void addCrime(Crime crime) {
        crimeList.add(crime);
    }

    /**
     * A method to remove a crime from crime list.
     * @param crime
     */
    public void removeCrime(Crime crime) {
        if (!crimeList.contains(crime)) {
            System.out.println("This crime is not within the list.");
        }
        else {
            crimeList.remove(crime);
        }
    }

    /**
     * A method to remove a friend from friends list
     * @param username
     */
    public void removeFriend(String username) {
        if (!friendList.contains(username)) {
            System.out.println("The user: " + username + " is not in your friends list.");
        }
        else {
            friendList.remove(username);
            System.out.println(username + " successfully added.");
        }
    }

    /**
     * A method to display the friends of a character
     */
    public void displayFriends() {
        for(String friend: friendList) {
            System.out.println(friend);
        }
    }

    /**
     * A method to view the list of crimes to be completed by a character
     */
    public void crimeTracker() {
        for (Crime crime: crimeList) {
            crime.display();
            System.out.println("\n");
        }
    }

    /**
     * A method to add achievements to record
     * @param achievement
     */
    public void addAchievements(String achievement) {
        achievements.add(achievement);
    }

    /**
     * A method to remove an achievement from record
     * @param achievement
     */
    public void removeAchievement(String achievement) {
        if(!achievements.contains(achievement)) {
            System.out.println("This achievement is not within your list.");
        }
        else {
            achievements.remove(achievement);
        }
    }

    /**
     * A method to display the profile of a character
     */
    public void displayProfile() {
        System.out.println("Username: " + userName);
        System.out.println("Cash: " + cashMoney);
        System.out.println("Level: " + level);
        System.out.println("Status: " + status);
        System.out.println("Stamina: " + stamina);
        System.out.println("Nerve: " + nerve);
        System.out.println("Muscle: " + muscle);
        System.out.println("Health: " + health);
        System.out.println("Achievements: ");
        for (String achievement : achievements) {
            System.out.println(achievement);
        }
    }
}
