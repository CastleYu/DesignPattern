package Composite;

import java.util.Vector;

public class Directory extends Entry {
    private final String name;                      // Ŀ����Q
    private final Vector directory = new Vector();  // Ŀ䛽����ļ���

    public Directory(String name) {           // ������
        this.name = name;
    }

    public String getName() {                 // ȡ��Ŀ����Q 
        return name;
    }

    public int getSize() {                    // ȡ��Ŀ����� 
        int size = 0;
        for (Object o : directory) {
            Entry entry = (Entry) o;
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {          // ��������� 
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) {       // ���������� 
        System.out.println(prefix + "/" + this);
        for (Object o : directory) {
            Entry entry = (Entry) o;
            entry.printList(prefix + "/" + name);
        }
    }
} 


