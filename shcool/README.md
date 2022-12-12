# School

This task will require you to have some knowledge of OOP, looping, and array to complete.

## The `Student` Class

A class called "Student" should contain:

#### Instance variables

- `id` the variable stores the student id and declare it as private (type: int)
- `latestId` the variable stores the latest id used by the Student object and declares it as private and static (type: int)
- `firstName` the variable stores the first name of the student and declare it as private (type: String)
- `lastName` the variable stores the last name of the student and declare it as private (type: String)

#### Constructor

The constructor should do these following task:

- set `id` as `latestId`
- increment `latestId` by 1
- receive the `firstName` and `lastName`, then assign them to the instance variables

#### Methods

- Getters of variables: `id`, `firstName`, and `lastName`
- Setter of variable: `firstName` and `lastName`
- `toString():String`

## The `School` Class

A class called "School" should contain:

#### Instance variables

- `id` the variable stores the school id and declare it as private (type: int)
- `latestId` the variable stores the latest id used by the School object and declares it as public and static (type: int)
- `name` the variable stores the school name and declare it as private (type: String)
- `students` the variable stores the student studying in the school and declare it as private (type: Student[])
- `size` the variable stores the amount of student that the school can handle and declare it as private (type: int)

#### Constructor

The constructor should do these following task:

- set `id` as `latestId`
- increment `latestId` by 1
- receive the `name` and `size`, then assign it to the instance variable
- init the `students` array

#### Methods

- Getters of variables: `id`, `name`, `students`, and `size`
- Setter of variable: `name`
- `addStudent(newStudent:Student):boolean` if the amount of students is more than or equal to the size, meaning the school can't accept more students, you should return false, otherwise, add a new student to the `students`'s array and return true
- `removeStudent(id:int):boolean` kick the student with the same student id you have received out of the school by removing a student from the `students`'s array
- `getAllStudent():Book[]` return all student in the school
- `resize(newSize:int):boolean` if the new size you have received is smaller or equal to the current student's array size, you should return false, or else expand the size of the student's array and return true
- `toString():String`
