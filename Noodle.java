public class Noodle {
  private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  private String ingredients;
  private String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
  }
  
  public boolean isTasty() {
    return true;
  }
}