package task;


public enum GeoPoliticalZones {
    SOUTH_SOUTH("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"),
    NORTH_EAST ("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_CENTRAL ("Benue", "Fct", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    SOUTH_EAST ("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_WEST ("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    NORTH_WEST ("Kaduna", "Katsina", "kano", "kebbi", "Sokoto", "Jigawa", "Zamfara");

   private final String[] zones;


    GeoPoliticalZones(String... zones) {
        this.zones = zones;
    }

    public  String[] getZones() {
        return zones;
    }
}
