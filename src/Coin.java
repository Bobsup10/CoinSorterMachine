/**
 * Coin Machhine Project
 * @author 24rossilli
 * @version 3.30.2023
 */
public abstract class Coin {

    /**
     * @return .01, .05, ..., .5, 1.0 based on implementing class object's value
     */
    public abstract double getValue();

    /**
     * @return "penny", "nickel", ...,"half dollar", "dollar"
     */
    public abstract String getName();

    /**
     *  define in the class: pennies, dimes...
     * @return
     */
    public String getPluralName()   {
        return getName().equals("penny") ? "pennies" : getName() + "s";
    }

    public boolean equals(Object other) {
        if(other instanceof Coin)   {
            return this.getValue() == ((Coin)other).getValue();
        }
        return false;
    }
}
