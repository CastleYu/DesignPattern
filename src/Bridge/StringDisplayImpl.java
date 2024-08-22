package Bridge;

public class StringDisplayImpl extends DisplayImpl {
    private final String string;
    private final int width;
    public StringDisplayImpl(String string) { 
        this.string = string;                  
        this.width = string.getBytes().length;                                          
    }
    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println("|" + string + "|"); // ��ӡʱǰ�����"|"��
    }
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                  // �����ǵ�"+"�Ǻš�
        for (int i = 0; i < width; i++) {       // ���width��"-"��
            System.out.print("-");              // ��Ϊ���ߡ�
        }
        System.out.println("+");                //�����ǵ�"+"�Ǻš�
    }
}
