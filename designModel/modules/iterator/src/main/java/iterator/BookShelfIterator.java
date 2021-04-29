package iterator;

public class BookShelfIterator implements Iterator{
    private int index;
    private BookShelf bookShelf;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        index = 0;
    }
    @Override
    public Boolean hasNext() {
       if (index<bookShelf.getLength()) {
           return true;
       }
       else return false;
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt( index++);
    }
}
