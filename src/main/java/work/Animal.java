package work;

public class Animal {
    String specie;
    int age;
    long hairCount;
    boolean isAlive;
    char gender;

    public void speak() {
        specie = "goryl";
        System.out.println("mati lubi " + specie +"e");
    }

    public void feed(String food) {
        System.out.println("jem sobie" + food);

    }

    public void feed(String food,int amount) {
        System.out.println("je sobie " + amount + food);


    }



}
