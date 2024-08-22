package Iterator;

import java.util.Iterator;

//ʵ��Iterator�ӿڼ��ɽ�BookShelfIterator��ΪIterator���д���
public class BookShelfIterator implements Iterator<Book> {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    //next��������Ŀǰ���飨Book�Ķ���ʵ������Ȼ���index�Ƶ���һ��Ϊλ��
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
