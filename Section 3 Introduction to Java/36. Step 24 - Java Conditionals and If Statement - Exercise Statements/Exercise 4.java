//Have four variables a, b, c and d. Create a statement for print if a + b is greater than c + d
int a = 2;
int b = 6;
int c = 0;
int d = 7;

int firstResult = a + b;
int secondResult = c + d;

if(firstResult > secondResult) {
    System.out.printf("a + b = %d is greater than c + d = %d", firstResult, secondResult).println();
}

//Have three angles of a triangle stored in three variables angle1, angle2 and, angle3.
//Create a if statement to state if the three angles can form a triangle.
//Hint: angle1 + angle2 + angle3 = 180

int angle1 = 60;
int angle2 = 60;
int angle3 = 60;

int sumOfAngles = angle1 + angle2 + angle3;
boolean canFormTriangle = sumOfAngles == 180;

if(canFormTriangle) {
    System.out.println("The three angles can form a triangle");
}

//Have a variable called number. Create a if statement to fin if it is an even number.
//Hint: % operator

int number = 10;
boolean isEven = number % 2 == 0;

if(isEven) {
    System.out.printf("%d is an even number", number).println();
}