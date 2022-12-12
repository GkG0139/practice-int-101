package school;

import java.util.Arrays;
import student.Student;

public class School {

  private final int id;
  private static int latestId;

  private String name;

  private Student[] students;

  private int size;
  private int count;

  public School(String name, int size) {
    id = latestId++;
    this.name = name;
    this.size = size;
    students = new Student[size];
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Student[] getStudents() {
    return students;
  }

  public int getSize() {
    return size;
  }

  public void setName(String name) {
    this.name = name;
  }

  private boolean isStudentSeatFull() {
    return !(count < size);
  }

  public boolean addStudent(Student newStudent) {
    if (isStudentSeatFull()) return false;
    students[count++] = newStudent;
    return true;
  }

  public boolean removeStudent(int id) {
    int tempCount = 0;
    Student[] temp = new Student[size];
    for (int i = 0; i < count; i++) {
      if (students[i] != null) {
        temp[tempCount++] = students[i];
        if (students[i].getId() == id) {
          students[i] = null;
        }
      }
    }
    count--;
    students = temp;
    return true;
  }

  public Student[] getAllStudent() {
    Student[] allStudent = new Student[count];
    for (int i = 0; i < count; i++) {
      allStudent[i] = students[i];
    }
    return allStudent;
  }

  public boolean resize(int newSize) {
    if (newSize <= size) return false;
    Student[] temp = new Student[newSize];
    for (int i = 0; i < count; i++) {
      if (students[i] != null) temp[i] = students[i];
    }
    students = temp;
    return true;
  }

  @Override
  public String toString() {
    return (
      "School [id=" +
      id +
      ", name=" +
      name +
      ", students=" +
      Arrays.toString(students) +
      ", size=" +
      size +
      ", count=" +
      count +
      "]"
    );
  }
}
