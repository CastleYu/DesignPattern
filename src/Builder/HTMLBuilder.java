package Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;                           // �������ļ���
    private PrintWriter writer;                        // д�뵽�ļ���PrintWriter
    public void makeTitle(String title) {              // HTML�ļ��ı���
        filename = title + ".html";                    // ���ݱ���Q���ļ���
        try {
            writer = new PrintWriter(new FileWriter(filename));  // ����PrintWriter
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        // �������
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) {               // HTML�ļ����ִ�
        writer.println("<p>" + str + "</p>");          // ��<p>��ǩ���
    }
    public void makeItems(String[] items) {            // HTML�ļ�����Ŀ
        writer.println("<ul>");                        // ��<ul>��<li>���
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }
    public Object getResult() {                        // ��ɵ��ļ�
        writer.println("</body></html>");              // �رձ�ǩ
        writer.close();                                // �ر��ļ�
        return filename;                               // �����ļ���
    }
}

