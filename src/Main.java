import java.util.Scanner;

public class Main {
    static BookManager kieuanh = new BookManager();
    public static void main(String[] args) {

        Book b1 = new Book("Sách 1", "TG1", 23000, 3, 0.2);
        Book b2 = new Book("Sách 2", "TG2", 13000, 5, 0.2);
        Book b3 = new Book("Sách 3", "TG3", 33000, 2, 0.5);
        Book b4 = new Book("Sách 4", "TG4", 53000, 1, 0.2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tạo mới");
        System.out.println("2. Sửa");
        System.out.println("3. Tìm giá lớn nhất");
        System.out.println("4. Tính tổng tiền");
        System.out.println("5. Thoát");
        int choice =0;
        while (choice != 5){
            System.out.println("Mời bạn lựa chọn chức năng");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    createNewBook();
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }

    private static void createNewBook() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        int number = scanner.nextInt();
        double weight = scanner.nextDouble();
        Book book = new Book(name, author, price, number, weight);
        kieuanh.addNewBook(book);
    }
}