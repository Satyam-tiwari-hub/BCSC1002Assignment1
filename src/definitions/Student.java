package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBooksIssuedByTheStudent;
    private String[] namesOfTheBooksIssuedByTheStudent;

    public Student(String firstName, String middleName, String lastName, long universityRollNumber,
                   int numberOfBooksIssuedByTheStudent, String[] namesOfTheBooksIssuedByTheStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssuedByTheStudent() {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent(int numberOfBooksIssuedByTheStudent) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public String[] getNamesOfTheBooksIssuedByTheStudent() {
        return namesOfTheBooksIssuedByTheStudent;
    }

    public void setNamesOfTheBooksIssuedByTheStudent(String[] namesOfTheBooksIssuedByTheStudent) {
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }

    /**
     * This method is used to display number of books issued.
     *
     * @param numberOfBooksIssuedByTheStudent Total number of books issued.
     * @return return int value
     */
    public int numberOfBooksIssued(int numberOfBooksIssuedByTheStudent) {
        return numberOfBooksIssuedByTheStudent;
    }

    @Override
    public String toString() {
        return "\nFirst Name='" + firstName +
                "\nMiddle Name='" + middleName +
                "\nLast Name='" + lastName +
                "\nUniversity RollNumber=" + universityRollNumber +
                "\nNumber Of Books Issued By The definitions.Student=" + numberOfBooksIssuedByTheStudent +
                "\nNames Of The Books Issued By The definitions.Student=" + Arrays.toString(namesOfTheBooksIssuedByTheStudent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssuedByTheStudent == student.numberOfBooksIssuedByTheStudent &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(middleName, student.middleName) &&
                Objects.equals(lastName, student.lastName) &&
                Arrays.equals(namesOfTheBooksIssuedByTheStudent, student.namesOfTheBooksIssuedByTheStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, middleName, lastName, universityRollNumber, numberOfBooksIssuedByTheStudent);
        result = 31 * result + Arrays.hashCode(namesOfTheBooksIssuedByTheStudent);
        return result;
    }
}
