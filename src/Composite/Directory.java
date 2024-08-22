package Composite;

import java.util.Vector;

public class Directory extends Entry {
    private final String name;                      // 目錄名稱
    private final Vector directory = new Vector();  // 目錄进入点的集合

    public Directory(String name) {           // 建構子
        this.name = name;
    }

    public String getName() {                 // 取得目錄名稱 
        return name;
    }

    public int getSize() {                    // 取得目錄容量 
        int size = 0;
        for (Object o : directory) {
            Entry entry = (Entry) o;
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {          // 新增进入点 
        directory.add(entry);
        return this;
    }

    protected void printList(String prefix) {       // 进入点的总览 
        System.out.println(prefix + "/" + this);
        for (Object o : directory) {
            Entry entry = (Entry) o;
            entry.printList(prefix + "/" + name);
        }
    }
} 


