package Strategy.AnotherExample;

public class RepTempRuleOne extends RepTempRule{
  RepTempRuleOne(String oldString) {
    super(oldString);
  }

  public void replace() {
    //replaceFirst��jdk1.4������
    newString=oldString.replaceFirst("aaa", "bbbb");
    System.out.println("this is replace one:");
  }
}