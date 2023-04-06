public class Penny extends Coin{
    /**
     * @return .01, .05, ..., .5, 1.0 based on implementing class object's value
     */
    @Override
    public double getValue() {
        return .01;
    }

    /**
     * @return "penny", "nickel", ...,"half dollar", "dollar"
     */
    @Override
    public String getName() {
        return "penny";
    }
}
