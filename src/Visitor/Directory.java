package Visitor;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
    private final String name;                    // 目录名称
    private final Vector dir = new Vector();      // 目录进入点的集合

    public Directory(String name) {         // 构造子
        this.name = name;
    }

    public String getName() {               // 取得名称
        return name;
    }

    public int getSize() {                  // 取得目录容量
        int size = 0;
        for (Object o : dir) {
            Entry entry = (Entry) o;
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {         // 新增进入点
        dir.add(entry);
        return this;
    }

    public Iterator iterator() {      // 产生Iterator
        return dir.iterator();
    }

    public void accept(Visitor v) {         // 接受访客
        v.visit(this);
    }
}

