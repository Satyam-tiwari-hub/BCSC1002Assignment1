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
}
