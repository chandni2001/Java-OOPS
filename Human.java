public class Human {
    String name;
    static long population;

    Human(String name){
        this.name = name;
        Human.population += 1;
    }
}
