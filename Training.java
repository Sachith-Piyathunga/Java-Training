//import java.util.Scanner;

// Java Identifiers
public class Training {
    public static void main(String[] args){
    
    Store newStore;
    newStore = new Store();
}

}




/*  
     static int myMethod(int x){
        return 5 + x;

    }
     System.out.println(myMethod(60));


    //Method with return value
    static int myMethod (int y, int x) { //If the method is return type we can use ptimitive data types (int, char) and use return method
        return y + x; //Is there have any retun value remove the void keyword
    }


    System.out.println(myMethod(10 ,5)); // output == 8 (5 + 3)
        int z = myMethod(10/5);
        System.out.println(z);

// A method with if else
    static void checkAge(int age){
        if (age > 20){
            System.out.println("He is adult");
        }else{
            System.out.println("He is child");
        }

    }
    checkAge(15);
    checkAge(30);

    static void myMethod (String fName, int age){
        System.out.println(fName + " is " + age);
    } 
    myMethod("Sachintha",10);
        myMethod("John", 50);
        myMethod("Sara", 20);

    static void myMethod (String fName){ // String is the method and fName is the parameter
        System.out.println(fName + " Sachintha");

    }    
    myMethod("John");
    myMethod("Sara"); // when parameter is passed to the method its call argument
     // in here fName is a parameter and while john and sara are the arguments
        

    static void myMethod(){  // Create a method
    myMethod();  // calling the method
    System.out.println("My name is Sachintha");
    }
        myMethod();
        myMethod();

    // multidimantional arrays
        int [] [] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}; // this is two dimantional array
        myNumbers [1][2] = 20; //Change element value previous = 7 , now = 20
        System.out.println(myNumbers[1][2]); //acsess the eliment of the array

        //Adding loop through multi dimantional array
        int [][] numbers = {{10, 20, 30, 40}, {50, 60, 70, 80}};
        for(int i = 0; i < numbers.length; i ++){
            for(int j = 0; j < numbers[i].length; ++j){
                System.out.println(numbers [i][j]);
            }
        }

    // Arrays real life examples
        //An array storing different numbers
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[2] = "Benz"; // change value of the array
        System.out.println(cars[2]);    
        System.out.println(cars.length); // check how many element in this array
        // tring loop through array
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        for(String i : cars){
            System.out.println(i);
        }

    // java break and continuw
        for (int i = 0; i < 8; i++)
        {
            if (i == 5)
            {
                break;
            }
            System.out.println(i);
        }

        //Try java continue
        for(int j = 0; j <= 10; j = j + 2) {
            if (j == 4){
                continue;
            }
            System.out.println(j);
        }
            //break and continuw with while loop
            int l = 0;
            while (l <= 5) {
                System.out.println(l);
                l++;
                if (l == 4) {
                    break;
                    
                }
                
            }

            int p = 0;
            while (p < 10) {
                if (p == 7) {
                    p++;
                    continue;                    
                }
                System.out.println(p);
                p++;
            }

    // try real life examples
          for(int i = 0; i <= 100; i +=10){
            System.out.println(i);
          }
           for(int j = 0; j <= 10; j +=2){
            System.out.println(j);
           }

           int num = 2;

           // print multification table for the number 2
           for(int k = 0; k<=10; k++){
            System.out.println(num + " x " + k + " = " + (num * k));
           }

    /**
     * 
           * for-each loop
           * for (type variableName : arrayName) {
                // code block to be executed
            }
                used with arrys
           
          String [] cars = {"BMW", "Benz", "VOLVO", "HONDA", "TOYOTA"};
          for (String i : cars) {
              System.out.println(i);
          }

    /**
           * Java nested loop
           * it means loop inside anothe loop  = inner loop
           
          for(int i = 1; i < 2; i++){
            System.out.println("Outter loop: " + i);
            
            for(int j = 1; j < 3; j++){
                System.out.println("Inner loop: " + j);
            }
          }

    /**
           * Java for loop
           * when we know how many times we need to loop the condion use for loop insted of while loop
           * for(stetment1; s2;s3){
           *     code
           * }
           
          //example 1
          for (int num = 1; num < 6; num++){
            System.out.println(num);
          }

          //example 1
          for (int i = 2; i <= 10; i = i + 2){
            System.out.println(i);
          }

    // real life example
        int countdown = 3;

        while ((countdown>0)) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year...!!");

        //   While loop with if,else
        int dice = 1;

        while (dice<=6) {
            if (dice<6) {
                System.out.println("You lose");
            }else{
                System.out.println("You win");
            }
            dice++; // dice = dice + 1;
          

    //  Ty do while loop
        // do while loop always check the last condtion, if last condition is fales code be stop
        int num = 0;
        do {
            System.out.println(num);
            num++;
        }
        while(num<8);    

        /**
         * Try java while loop
         * while loop only run when tthe set conndition is  ture
         * while (condition){
         *   //code is here
         * }
         */
        //  Basic while loop
        /*int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //Set a defult keyword to switch case
        int day = 4;

        switch (day) {
            case 6:
                System.out.println("It\'s Saturday");
                break;
            case 7:
                System.out.println("It\'s Sunday");
                break;
        
            default:
            System.out.println("Looking forward to the weekrnd");
                break;  // Is there not any casses match to  the set args it pass the value to defult keyword 
        }


        //Scanner scn = new Scanner(System.in);  //Add Scanner to yser input

        //System.out.println("Enter 1 to 7 weekdays: ");
        //int num = scn.nextInt();

        //Java switch statements
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
        
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thurseday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }

        //  My6 intervive queaction
        int num = 5;

        if  (num/2 == 0){
            System.out.println(num + " is even number.");
        }else{
            System.out.println(num + " is odd number");
        }

        // basic Java short hand if...else
        // this is simplae and efective way
        int time = 18;

        String result = (time < 14) ? "Good day" : "Good evening";
        System.out.println(result);

        int myAge = 25; // simple if else condition
        int johnAge  = 30;

        if(myAge >= johnAge) {
            System.out.println("I\'m older than John");
        } else {
            System.out.println("I\'m still younge than John");
        }

        // Simple if condition
        if (500 > 400) {
            System.out.println("500 is grater than 400");
        }

        //bsic else if condition
        int time = 23;
        
        if (time < 11) {
            System.out.println("Good mornning");
        } else if (time <18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

            System.out.println(Math.max(26, 50));// find max value
            System.out.println(Math.min(5, 10));//Find minimum value
            System.out.println(Math.sqrt(81));//Find squreroot of the nuumber
            System.out.println(Math.abs(-4.5));//Return positive value
            System.out.println(Math.random());//Returns a random number between 0.0 (inclusive), and 1.0
            
            int randomNumber = (int)(Math.random() * 50);//0 to 50 any number
            System.out.println(randomNumber);

       //test java string special caracters
        String txt = "I\'m Sachintha";
        String txt1 = "Mya name is \"Sachintha\"";
        String txt2 = "The caracter \\ is called backslash";

        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);

        String txt3 = "Hello\rWorld!";// Carriage Return
        System.out.println(txt3);

        String txt4 = "Hello\tWorld!";// Tab
        System.out.println(txt4);

        String txt5 = "Hello\nWorld!";//next line
        System.out.println(txt5);
        
        String fName = "Sachintha ";
        String lName = "Chamod";

        System.out.println(fName.concat(lName));// concatenate 2 String

        int minutesPerhour = 60; //"minutesPerhour" good java Identifier for variable
        String check = "commits are working properly";
        
        String myName = "Sachitha Chamod Piyathunga";
        
        System.out.println("The length of my name is: " + myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());

        String txt = "My name is Sachintha. Isthat true??";

        System.out.println(txt.indexOf("Sachintha"));// finding where the caracters are located


        //Widening Casting
        int myInt = 5;
        double  myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        double  myDouble1 = 5.6d;
        int myInt1 = (int)  myDouble1;// Manual casting: double to int

        System.out.println(myDouble1);
        System.out.println(myInt1);

        // Example
        int maxScore = 400;// max score of the game
        int  userScore = 350; // the score of the user
        
        //To calculatethe presentage of this
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is: " + percentage);

        int  item = 30;
        float costPerItem = 6.5f;
        float totalCost = item * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + item);
        System.out.println("Cost per item: " + currency + costPerItem);
        System.out.println("Total cost: " + currency + totalCost);
        
        char myGrade = 'A';
        char myVar = 22, myVar1 = 20;

        System.out.println(myGrade);
        System.out.println(myVar);
        System.out.println(myVar1);


        System.out.println(minutesPerhour);
        System.out.println(check); 
        String studentName = "Sachintha";
        int studentId = 20221948;
        int studentAge = 25;
        float studentMarks =75.32f;
        char studentgrade = 'B';

        System.out.println(studentName);
        System.out.println(studentId);
        System.out.println(studentAge);
        System.out.println(studentMarks);
        System.out.println(studentgrade);

        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area  = length *width;

        // Print variables
        System.out.println("length is: " + length);
        System.out.println("width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

        there are 2 data types 
        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes
        */