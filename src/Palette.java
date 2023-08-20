class Palette {
    protected String flavor;
    protected double price;

    public Palette(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public void showInformation() {
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price + " pesos");
    }
}
class WaterPalette extends Palette {
    private boolean waterbase;

    public WaterPalette(String flavor, double price, boolean waterbase) {
        super(flavor, price);
        this.waterbase = waterbase;
    }

    public void showWaterBase() {
        System.out.println("Water Base: " + (waterbase ? "Yes" : "No"));
    }

    // Additional functionality: Increase price by 2 pesos
    public void increasePrice() {
        price += 2;
    }
}
class CreamPalette extends Palette {
    private boolean creamy;

    public CreamPalette(String flavor, double price, boolean creamy) {
        super(flavor, price);
        this.creamy = creamy;
    }

    public void showCreamTexture() {
        System.out.println("Creamy Texture: " + (creamy ? "Yes" : "No"));
    }

    // Additional functionality: Increase price by 6 pesos
    public void increasePrice() {
        price += 6;
    }
}

