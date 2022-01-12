public class Animal {
    
    int id;
    int numberOfPaws;
    String name;
    int age;
    int size;
    int weight;
    String species;
    String phylum;
    String description;
    String location;
    String path;
    String foodBase;
    Boolean hungry;
    Boolean thirsty;

    public void toFeed() {
        this.hungry = true;
        System.out.println(name + ": Munch munch munch");
    }

    public void toGiveWater() {
        this.thirsty = true;
        System.out.println(name + ": Slap slap slap");
    }

}
