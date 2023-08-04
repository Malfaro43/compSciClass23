public class Driver {
    public static void main(String[] args) {
        /*
        
        
        */
        
        
        Animal a = new Animal();
        Animal b = new Snake();
        // Snake c = new Animal();
        Snake d = new Snake();
        
        a.name = "John";
        
        ((Snake)b).snakeSpiritPower = 1;
        
        a.makeNoise(); // Animal Version
        b.makeNoise(); // Wolf Version
        d.makeNoise(); // Wolf Version
        ((Snake) b).runFreelyInTheForest(); // Would not work without casting
        d.runFreelyInTheForest();
        // Compiler only looks at variable type to determine legality of method calls
    }
}