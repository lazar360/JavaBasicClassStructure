package inheritance;

public interface Herbivore {

    default void eatPlants(){
        System.out.println("eat plants");
    }

    // default int getRequiredPantAmount(); // does not compile because the method ahas no body
    // public int getRequiredPlantAmount(){return ;} // does not compile because there is no default keyword


}
