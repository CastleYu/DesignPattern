package Strategy.AnotherExample;

public class RepTempRuleSolve {
    private RepTempRule strategy;

    public RepTempRuleSolve(RepTempRule rule) {
        this.strategy = rule;
    }

    public void getNewContext(Site site, String oldString) {
        strategy.replace();
    }

    public void changeAlgorithm(RepTempRule newAlgorithm) {
        strategy = newAlgorithm;
    }
}
