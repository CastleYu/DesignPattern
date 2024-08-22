package Visitor;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private final String name;                    // Ŀ¼����
    private final Vector dir = new Vector();      // Ŀ¼�����ļ���
    public Directory(String name) {         // ������
        this.name = name;
    }
    public String getName() {               // ȡ������
        return name;
    }
    public int getSize() {                  // ȡ��Ŀ¼����
        int size = 0;
        for (Object o : dir) {
            Entry entry = (Entry) o;
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {         // ���������
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {      // ����Iterator 
        return dir.iterator();
    }
    public void accept(Visitor v) {         // ���ܷÿ�
        v.visit(this);
    }
}

