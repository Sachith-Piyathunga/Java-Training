class Ramen extends Noodle {
  
  // Add ramen method
  Ramen() {
    
    super(30.0, 0.3, "flat", "wheat flour");
    
  }
  
  // Add getcookprep method
  public String getCookPrep() {
    
    // Return the messege
    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
    
  }
  
}