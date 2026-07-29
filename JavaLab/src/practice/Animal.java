package practice;

public class Animal {
    
    private String species; 
    private String habitat;

    public Animal() {

    }

    public Animal(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public void Set (String a, String b) {
        species = a;
        habitat = b;
    }

    public void Disp1() {
        System.out.println("종: " + species);
        System.out.println("서식지: " + habitat);

    }

}
