public class Chokolate {
    public int weight;
    public Chokolate(int weight, String name){
        this.weight = weight;
    }
@Override
    public String toString(){
        return "Chocolate{"+ "class = " + this.getClass().getSimpleName()+", weight "+weight+'}';
}

}
