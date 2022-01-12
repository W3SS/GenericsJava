public class Cat extends Animal {
    
    private String lunchPreference;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        if (!hungry) toFeed();
        if (!thirsty) toGiveWater();
    }

    public String getLunchPreference() {
        return lunchPreference;
    }

    public void setLunchPreference(String lunchPreference) {
        try { 
            this.lunchPreference = lunchPreference;
        } catch (Exception e) {
            throw new IllegalStateException("Cats don't eat" + lunchPreference + "." + e.getMessage());
        }
    }

}