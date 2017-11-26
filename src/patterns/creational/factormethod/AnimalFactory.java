package patterns.creational.factormethod;

/**
 * Created by gaurav on 26/11/17.
 */
public class AnimalFactory {
    public Animal getAnimal(String animal) {
        switch (animal.toLowerCase()) {
            case "terrestrial":
                return new TerrestrialAnimal();
            case "aquatic":
                return new AquaticAnimal();
            case "ariel":
                return new ArielAnimal();
            default:
                return null;
        }
    }
}
