package Lab.Lab4.controller;

import Lab.Lab4.model.Group;
import Lab.Lab4.model.Sex;
import Lab.Lab4.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}
