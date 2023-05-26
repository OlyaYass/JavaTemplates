package Pract8.TemplateMethod;

public class Tester {
    public static void main(String[] args) {
        TemplateClass class1 = new Class1();
        TemplateClass class2 = new Class2();

        class1.printInfo();
        System.out.println();
        class2.printInfo();
    }
}
