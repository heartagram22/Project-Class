package main;
import project.Project;
public class Main {
    public static void main(String[] args) {
        Project ProjectTest = new Project();
        ProjectTest.setName("hello");
        ProjectTest.setDescription("this procejt sets a name");
        System.out.println(ProjectTest.name);
        System.out.println(ProjectTest.description);
    }
}
