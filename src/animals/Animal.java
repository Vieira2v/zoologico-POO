package animals;
public abstract class Animal {
    private String animalClass;
    private int year;
    private String species;
    private String food;
    private String habitats;

    public abstract void foodClassification();

    public String getAnimalClass() {
        return animalClass;
    }
    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    
    
}
