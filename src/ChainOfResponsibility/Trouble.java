package ChainOfResponsibility;

/**
 * @param number ������
 */
public record Trouble(int number) {
    // ��������

    public String toString() {      // ��ӡ��ʾ������ִ�
        return "[Trouble " + number + "]";
    }
}

