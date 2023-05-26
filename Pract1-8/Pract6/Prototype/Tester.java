package Pract6.Prototype;

public class Tester {
    public static void main(String[] args) {
        Project project = new Project(1, "Project1", "Some code");
        System.out.println(project);

        Project clone = (Project) project.copy();
        System.out.println();
        System.out.println(clone);
    }
}
