public class Dog extends Animal {
    
    int walkDistancePreference;
    
    public void bark() {
        if (!hungry) toFeed();
        if (!thirsty) toGiveWater();
    }


}
