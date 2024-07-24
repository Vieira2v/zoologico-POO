package animals;

public class Vertebrates extends Animal{
    @Override
    public void foodClassification(){
        switch (getFood()) {
            case "Vegetables":
                System.out.println("Food classification: Herbivores");
                break;
            case "Meat":
                System.out.println("Food classification: Carnivores");
                break;
            case "Vegetables and Meats":
                System.out.println("Food classification: Omnivores");
                break;
            case "Insects":
                System.out.println("Food classification: Insectivores");
                break;
            case "Fruits":
                System.out.println("Food classification: Frugivores");
                break;
            case "Leafs":
                System.out.println("Food classification: Folivores");
                break;
            case "Seeds and Grains":
                System.out.println("Food classification: Granivores");
                break;
            case "Fishs":
                System.out.println("Food classification: Piscivores");
                break;
            case "Nectar":
                System.out.println("Food classification: Nectivores");
                break;
        }
    }
}
