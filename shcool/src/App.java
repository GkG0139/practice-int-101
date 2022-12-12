import school.School;
import student.Student;

public class App {

  public static void main(String[] args) throws Exception {
    testStudent();
    testSchool();
    testAddStudentToSchool();
    testRemoveStudentFromSchool();
    testResize();
  }

  private static void testStudent() {
    Student student1 = new Student("Guy", "K.");
    Student student2 = new Student("Blue", "Boy");
    System.out.println(student1);
    System.out.println(student2);
    System.out.println("=======");
  }

  private static void testSchool() {
    School school1 = new School("NSSC", 5);
    School school2 = new School("KMUTT", 10);
    System.out.println(school1);
    System.out.println(school2);
    System.out.println("=======");
  }

  private static void testAddStudentToSchool() {
    School school1 = new School("NSSC", 5);
    School school2 = new School("KMUTT", 10);

    Student student1 = new Student("Guy", "K.");
    Student student2 = new Student("Blue", "Boy");
    Student student3 = new Student("Blue", "Girl");

    school1.addStudent(student1);
    school1.addStudent(student2);
    school2.addStudent(student3);

    System.out.println(school1);
    System.out.println(school2);
    System.out.println("=======");
  }

  private static void testRemoveStudentFromSchool() {
    School school1 = new School("NSSC", 5);

    Student student1 = new Student("Guy", "K.");
    Student student2 = new Student("Blue", "Boy");

    school1.addStudent(student1);
    school1.addStudent(student2);

    school1.removeStudent(student1.getId());

    System.out.println(school1);
    System.out.println("=======");
  }

  private static void testResize() {
    School school1 = new School("NSSC", 5);
    school1.resize(100);
    System.out.println(school1);
    System.out.println("=======");
  }
}
