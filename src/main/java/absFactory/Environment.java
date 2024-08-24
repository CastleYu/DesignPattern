package absFactory;

public interface Environment {
    void showMessage();
}

class EnvironmentA implements Environment {
    @Override
    public void showMessage() {
    }
}

class EnvironmentB implements Environment {
    @Override
    public void showMessage() {
    }
}
