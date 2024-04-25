package Lab.Lab4.controller;

import Lab.Lab4.model.Faculty;
import Lab.Lab4.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}
