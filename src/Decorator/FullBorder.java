package Decorator;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    public int getColumns() {                   // �����������������������ߵ�װ���ַ�
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                      // �������������������µ�װ���ַ�
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {         // ָ�����еă���
        if (row == 0) {                                                 // ��򶥶�
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                      // ���ײ�
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        // ��������
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {         // ���ַ�ch�������ظ�count�ε������ִ�
        StringBuilder buf = new StringBuilder();
        buf.append(String.valueOf(ch).repeat(Math.max(0, count)));
        return buf.toString();
    }
}
