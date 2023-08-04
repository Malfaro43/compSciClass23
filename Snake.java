public class Snake extends Animal {
    
    int snakeSpiritPower; // we can have more variables that aren't in animal
    
    public String scientificName() {
        return "Serpentes";
    }

    public void makeNoise() {
        System.out.println("ssss");
    }
        
    public void runFreelyInTheForest() { // same with methods
        System.out.println("Runs freely in the forest.");
    }
}