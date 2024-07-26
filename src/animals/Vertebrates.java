package animals;

public class Vertebrates extends Animal{
    @Override
    public void foodClassification(){
        switch (getAlternativeFood()) {
            case 1:
                setFood("Vegetables");
                System.out.println("Food classification: Herbivores");
                break;
            case 2:
                setFood("Meat");
                System.out.println("Food classification: Carnivores");
                break;
            case 3:
                setFood("Vegetables and Meat");
                System.out.println("Food classification: Omnivores");
                break;
            case 4:
                setFood("Insects");
                System.out.println("Food classification: Insectivores");
                break;
            case 5:
                setFood("Fruits");
                System.out.println("Food classification: Frugivores");
                break;
            case 6:
                setFood("Leafs");
                System.out.println("Food classification: Folivores");
                break;
            case 7:
                setFood("Seeds and Grains");
                System.out.println("Food classification: Granivores");
                break;
            case 8:
                setFood("Fishs");
                System.out.println("Food classification: Piscivores");
                break;
            case 9:
                setFood("Nectar");
                System.out.println("Food classification: Nectivores");
                break;
        }
    }

    @Override
    public void habitatsTypes() {
        switch (getAlternativeHabitats()) {
            case 1:
                setHabitats("Forest");
                break;
            case 2:
                setHabitats("Deserts");
                break;
            case 3:
                setHabitats("Fresh Water");
                break;
            case 4:
                setHabitats("Marine");
                break;
            case 5:
                setHabitats("Grasslands");
                break;
            case 6:
                setHabitats("Tundra");
                break;
            case 7:
                setHabitats("Mountains");
                break;
            case 8:
                setHabitats("Wetlands");
                break;
        
        }
    }
}
