package student;

public class Student {

  private final int id;
  private static int latestId;

  private String firstName;
  private String lastName;

  public Student(String firstName, String lastName) {
    id = latestId++;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return (
      "Student [id=" +
      id +
      ", firstName=" +
      firstName +
      ", lastName=" +
      lastName +
      "]"
    );
  }
}
