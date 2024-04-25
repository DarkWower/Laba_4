package Lab.Lab4.controller;

import Lab.Lab4.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}
