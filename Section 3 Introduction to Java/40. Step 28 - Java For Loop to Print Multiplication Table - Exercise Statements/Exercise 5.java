//Do the whole 7 multiplication table. Kill Jshell. Repeat. Rinse. Start Again.
for (int i = 1; i <= 10; i++) {
    System.out.printf("%d * %d = %d", 7, i, 7 * i).println();
}

// Print 6 and 10 tables
for (int i = 1; i <= 10; i++) {
    System.out.printf("%d * %d = %d", 6, i, 6 * i).println();
}

for (int i = 1; i <= 10; i++) {
  System.out.printf("%d * %d = %d", 10, i, 10 * i).println();
}

//Print numbers from 1 to 10
for (int i = 1; i <= 10; i++) {
  System.out.println(i);
}

//Print numbers from 10 to 1
for (int i = 10; i >= 1; i--) {
  System.out.println(i);
}

//Print squares of first 10 numbers
for(int i = 1; i <= 10; i++) {
  System.out.printf("The square of %d is %.0f", i, Math.pow(i, 2)).println();
}

//Print squares of first 10 even numbers
for(int i = 1; i <= 20; i++) {
  if(i % 2 == 0) {
    System.out.printf("The square of %d is %.0f", i, Math.pow(i, 2)).println();
  }
}

//Print squares of first 10 odd numbers
for(int i = 1; i <= 20; i++) {
  if(i % 2 != 0) {
    System.out.printf("The square of %d is %.0f", i, Math.pow(i, 2)).println();
  }
}
