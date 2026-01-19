public class CoffeeMaker {
    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    // Constructor
    public CoffeeMaker() {
        this.isOn = false;
        this.coffeeType = "normal"; 
        this.coffeeAmount = 10;     
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCoffeeType(String type) {
        if (isOn && (type.equalsIgnoreCase("normal") || type.equalsIgnoreCase("espresso"))) {
            coffeeType = type.toLowerCase();
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
