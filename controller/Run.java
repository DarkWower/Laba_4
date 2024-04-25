package Lab.Lab4.controller;

import Lab.Lab4.ComponentCreator;
import Lab.Lab4.model.University;

public class Run {
    public static void main(String[] args) {
        ComponentCreator componentCreator = new DefaultComponentCreator();
        UniversityCreator universityCreator = new UniversityCreator(componentCreator);
        University university = universityCreator.createTypicalUniversity("NTU DP");
    }
}
