public class ScopeExample{
  public static void main(String[] args){
  
  int[] myArray = {1, 2, 3, 4};

  int sum = 0;

  for(int i = 0; i < myArray.length; i++){
    
    sum += myArray[i];

    System.out.println("this is in inside the for loop: " + sum);
  }
  System.out.println("This is in outside the for loop: " + sum);
  }
}