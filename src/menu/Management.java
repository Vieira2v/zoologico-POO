package menu;
import java.util.ArrayList;
import animals.Animal;
import employees.Administrators;
import employees.Keepers;
import employees.Veterinarians;

public class Management {
    private static ArrayList<Animal> animalsList = new ArrayList<>();
    private static ArrayList<Keepers> keepersList = new ArrayList<>();
    private static ArrayList<Administrators> admList = new ArrayList<>();
    private static ArrayList<Integer> listMonthlyFoods = new ArrayList<>();
    private static ArrayList<Integer> listMonthlyConsultations = new ArrayList<>();
    private static ArrayList<Integer> listMonthlyCleaning = new ArrayList<>();
    private static ArrayList<Veterinarians> vetList = new ArrayList<>();
    private static ArrayList<Double> salaryList = new ArrayList<>();

    public static ArrayList<Animal> getAnimalsList() {
        return animalsList;
    }
    public static void registerAnimal(Animal animal) {
        animalsList.add(animal);
    }

    public static ArrayList<Keepers> getKeepersList() {
        return keepersList;
    }
    public static void registerKeeper(Keepers keepers) {
        keepersList.add(keepers);
    }

    public static ArrayList<Administrators> getAdmList() {
        return admList;
    }
    public static void registerAdm(Administrators adm) {
        admList.add(adm);
    }
    public static ArrayList<Integer> getListMonthlyFoods() {
        return listMonthlyFoods;
    }
    public static void registerFoods(Integer adm) {
        listMonthlyFoods.add(adm);
    }
    public static ArrayList<Integer> getListMonthlyCleaning() {
        return listMonthlyCleaning;
    }
    public static void registerCleaning(Integer adm) {
        listMonthlyCleaning.add(adm);
    }
    public static ArrayList<Integer> getlistMonthlyConsultations() {
        return listMonthlyConsultations;
    }
    public static void registerConsultations(Integer adm) {
        listMonthlyConsultations.add(adm);
    }

    public static ArrayList<Veterinarians> getVetList() {
        return vetList;
    } 
    public static void registerVet(Veterinarians vet) {
        vetList.add(vet);
    }
    public static ArrayList<Double> getSalaryList() {
        return salaryList;
    } 
    public static void registerSalary(Double salary) {
        salaryList.add(salary);
    }
}
