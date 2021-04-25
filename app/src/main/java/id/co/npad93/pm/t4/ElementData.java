package id.co.npad93.pm.t4;

public class ElementData {
    private ElementData(String a, String b) {
        name = a;
        nation = b;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public static int count() {
        initialize();
        return all.length;
    }

    public static ElementData get(int i) {
        initialize();
        return all[i];
    }

    private static void initialize() {
        if (all == null) {
            all = new ElementData[] {
                new ElementData("Anemo", "Mondstadt"),
                new ElementData("Geo", "Liyue"),
                new ElementData("Electro", "Inazuma"),
                new ElementData("Dendro", "Sumeru"),
                new ElementData("Hydro", "Fontaine"),
                new ElementData("Pyro", "Natlan"),
                new ElementData("Cryo", "Snezhnaya")
            };
        }
    }

    private final String name, nation;
    private static ElementData[] all;
}
