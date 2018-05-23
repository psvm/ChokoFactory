public class ChokoFactory {
    public static Chokolate produceChokolate(int weight, String type){
        if (type == "White") return new WhiteChokolate(weight);
        if (type == "Milk") return new MilkChokolate(weight);
        if (type == "Bitter") return new BitterChokolate(weight);
        else return null;
    }
}
