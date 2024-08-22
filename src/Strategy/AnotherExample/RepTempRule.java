package Strategy.AnotherExample;

public abstract class RepTempRule {
    protected String oldString;
    /*public void setOldString(String oldString){
      this.oldString=oldString;
    }*/
    protected String newString = "";

    RepTempRule(String oldString) {
        this.oldString = oldString;
    }

    public String getNewString() {
        return newString;
    }

    public abstract void replace();
}
