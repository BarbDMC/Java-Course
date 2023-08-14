//Create a method - printNumbers(int n) to print numbers from 1 to n
void printNumbers(int n) {
  for (int i = 1; i <= n; i++) {
    System.out.println(i);
  }
}

printNumbers(4);

//Create a method - printSquaresOfNumbers(int n) to print squares of numbers from 1 to n
void printSquaresOfNumbers(int n) {
  for (int i = 1; i <= n; i++) {
    System.out.printf("%.0f", Math.pow(i, 2)).println();
  }
}

printSquaresOfNumbers(5);