package Strategy.AnotherExample;

public class RepTempRuleTwo extends RepTempRule {
    RepTempRuleTwo(String oldString) {
        super(oldString);
    }

    public void replace() {
        newString = oldString.replaceFirst("aaa", "ccc");
        System.out.println("this is replace Two:");
    }
}