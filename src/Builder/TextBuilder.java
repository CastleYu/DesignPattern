package Builder;

public class TextBuilder extends Builder {
    //������String������StringBuffer�в��У��к�����
    private final StringBuffer buffer = new StringBuffer();    // ��ʼ�ڴ����Խ����ļ�

    public void makeTitle(String title) {        // һ�����ָ�ʽ�ı���
        buffer.append("==============================\n");    // ����
        buffer.append("��").append(title).append("��\n");            // �С����ı���
        buffer.append("\n");                    // ����
    }

    public void makeString(String str) {        // һ�����ָ�ʽ���ִ�
        buffer.append('��').append(str).append("\n");        // �С����ִ�
        buffer.append("\n");                // ����
    }

    public void makeItems(String[] items) {        // һ�����ָ�ʽ����Ŀ
        for (String item : items) {
            buffer.append("#").append(item).append("\n");    // ��?����Ŀ
        }
        buffer.append("\n");                // ����
    }

    public Object getResult() {                // ��ɵ��ļ�
        buffer.append("==============================\n");    // ����
        return buffer.toString();        // ��StringBufferת����String
    }
}

