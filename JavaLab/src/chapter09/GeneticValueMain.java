package chapter09;

public class GeneticValueMain {
    public static void main(String[] args) {
        
        GeneticValue<String> v1 = new GeneticValue<>();
        v1.setValue("soldesk");
        System.out.println(v1.getValue());
        
        // Character
        GeneticValue<Character> v2 = new GeneticValue<>();
        v2.setValue('A');
        System.out.println(v2.getValue());

        // Integer
        GeneticValue<Integer> v3 = new GeneticValue<>();
        v3.setValue(100);
        System.out.println(v3.getValue());
        // Double
        GeneticValue<Double> v4 = new GeneticValue<>();
        v4.setValue(99.99);
        System.out.println(v4.getValue());

    }//main
}//class
