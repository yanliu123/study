package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
    private List<Book> bookList;
    private int last=0;
    public BookShelf(int max){
        bookList = new ArrayList<>(max);
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public int getLength() {
        return last;
    }

    public Object getBookAt(int index) {
        return bookList.get(index);
    }

    public void appendBook(Book book) {
        this.bookList.add(book) ;
        last++;
    }
}
