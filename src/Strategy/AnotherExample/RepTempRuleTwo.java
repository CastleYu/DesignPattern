package Strategy.AnotherExample;

public class RepTempRuleTwo extends RepTempRule{
  public void replace() {
    newString=oldString.replaceFirst("aaa", "ccc");
    System.out.println("this is replace Two:");
  }
}