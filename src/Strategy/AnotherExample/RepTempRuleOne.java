package Strategy.AnotherExample;

public class RepTempRuleOne extends RepTempRule{
  RepTempRuleOne(String oldString) {
    super(oldString);
  }

  public void replace() {
    //replaceFirst是jdk1.4新特性
    newString=oldString.replaceFirst("aaa", "bbbb");
    System.out.println("this is replace one:");
  }
}