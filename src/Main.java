public class Main {
    public static void main(String[] args) {
        WaterPalette waterPalette = new WaterPalette("Strawberry", 20.0, true);
        CreamPalette creamPalette = new CreamPalette("Chocolate", 30.0, true);

        waterPalette.showInformation();
        waterPalette.showWaterBase();
        waterPalette.increasePrice();
        waterPalette.showInformation(); // Price increased

        System.out.println();

        creamPalette.showInformation();
        creamPalette.showCreamTexture();
        creamPalette.increasePrice();
        creamPalette.showInformation(); // Price increased
    }
}