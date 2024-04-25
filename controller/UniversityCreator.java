package Lab.Lab4.controller;

import Lab.Lab4.ComponentCreator;
import Lab.Lab4.JsonManager;
import Lab.Lab4.model.*;
import java.io.IOException;

public class UniversityCreator {
    private ComponentCreator componentCreator;
    private JsonManager jsonManager;

    public UniversityCreator(ComponentCreator componentCreator) {
        this.componentCreator = componentCreator;
        this.jsonManager = new JsonManager();
    }

    public University createTypicalUniversity(String name) {
        University university = (University) componentCreator.createUniversity(name);

        Faculty faculty1 = componentCreator.createFaculty("Information technologies", new Human("Daniel", "Ivanov", "Denisovich", Sex.MALE));
        university.addFaculty(faculty1);
        Faculty faculty2 = componentCreator.createFaculty("Financially economical", new Human("Viktoria", "Petrenko", "Yuryivna", Sex.FEMALE));
        university.addFaculty(faculty2);

        Department department1 = (Department) componentCreator.createDepartment("System analysis and management", new Human("Daniel", "Ivanov", "Denisovich", Sex.MALE));
        faculty1.addDepartment(department1);
        Department department2 = (Department) componentCreator.createDepartment("Marketing", new Human("Viktoria", "Petrenko", "Yuryivna", Sex.FEMALE));
        faculty2.addDepartment(department2);

        Group group1 = new Group("124-20-2");
        Student student1 = (Student) componentCreator.createStudent("Daniel", "Ivanov", "Denisovich", Sex.MALE, group1);
        department1.addStudent(student1);

        Group group2 = new Group("075-20-1");
        Student student2 = (Student) componentCreator.createStudent("Viktoria", "Petrenko", "Yuryivna", Sex.FEMALE, group2);
        department2.addStudent(student2);

        return university;
    }

    public void saveUniversityToJsonFile(University university, String filePath) throws IOException {
        String json = jsonManager.toJson(university);
        jsonManager.writeJsonToFile(json, filePath);
    }

    public University loadUniversityFromJsonFile(String filePath) throws IOException {
        String json = jsonManager.readJsonFromFile(filePath);
        return jsonManager.fromJson(json, University.class);
    }
}