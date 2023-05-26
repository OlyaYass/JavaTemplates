package Pract8.TemplateMethod;

public abstract class TemplateClass {
        public void printInfo() {
            System.out.println("Hello!");
            show();
            System.out.println("Bye bye!");
        }

        public abstract void show();

}
