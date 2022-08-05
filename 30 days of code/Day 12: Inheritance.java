
import java.util.*;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;
    int x;

    Student(String firstName, String lastName, int Id, int[] testScores) {
        super(firstName, lastName, Id);
        this.testScores = testScores;

    }

    char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            x = x + testScores[i];
        }
        x = x / testScores.length;
        if (90 <= x && x <= 100) {
            return 'O';
        } else if (80 <= x && x < 90) {
            return 'E';
        } else if (70 <= x && x < 80) {
            return 'A';
        } else if (55 <= x && x < 70) {
            return 'P';
        } else if (40 <= x && x < 55) {
            return 'D';
        } else if (0 <= x && x < 40) {
            return 'T';
        } else {
            return Character.MIN_VALUE;
        }
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
