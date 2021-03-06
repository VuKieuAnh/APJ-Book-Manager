public class BookManager {
    private Book bookList[] = new Book[20];

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public void addNewBook(Book newBook){
        //kiểm tra xem đủ 20 quyển sách chưa
        // index ở đâu null thì sẽ thêm sách ở đó
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null){
                bookList[i] = newBook;
                System.out.println("Thêm mới thành công");
                return;
            }
        }
        System.out.println("Thư viện đã đầy");
    }

    public void editBookByIndex(int index, Book newBook){
        //index nằm trong khoảng 0-19
        if (index<20 && index>=0){
            //booklist tại index có null không?
            if (bookList[index] != null)
                bookList[index] = newBook;
            else return;
        }
    }

    public int getMaxPrice(){
        int max=0;
        for (Book b:
             bookList) {
            if (b!= null)
                if (b.getPrice() >max) max= b.getPrice();
        }
        return max;
    }
    public int getSumPrice(){
        int sumOfPrice=0;
        for (Book b:
             bookList) {
            if (b!= null) sumOfPrice += b.getTotalPrice();
        }
        return sumOfPrice;
    }

}