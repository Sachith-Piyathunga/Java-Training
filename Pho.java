class Pho extends Noodle {
  
  // Add pho method
  Pho() {
    
    super(30.0, 0.64, "flat", "rice flour");
    
  }
  
  // Add get cook prep method
  public String getCookPrep() {
    
    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
    
  }
  
}