package annotationToDesignPattern;

@Singleton
public class MySingletonClass {
    public MySingletonClass() {
    }

    public void showMessage() {
        System.out.println("Hello from singleton instance!");
    }
}
