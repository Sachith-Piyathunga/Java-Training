// Java Identifiers
public class Training {
    public static void main(String[] args) {
        String myName = "Sachitha Chamod Piyathunga";
        
        System.out.println("The length of my name is: " + myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());

        String txt = "My name is Sachintha. Isthat true??";

        System.out.println(txt.indexOf("Sachintha"));

    }
}

/*
        int minutesPerhour = 60; //"minutesPerhour" good java Identifier for variable
        String check = "commits are working properly";
        
        
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