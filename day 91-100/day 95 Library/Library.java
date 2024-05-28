import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void borrowBook(String bookId, String memberId) throws Exception {
        Book book = books.get(bookId);
        if (book == null) {
            throw new Exception("Book not found");
        }
        if (book.isBorrowed()) {
            throw new Exception("Book is already borrowed");
        }
        Member member = members.get(memberId);
        if (member == null) {
            throw new Exception("Member not found");
        }
        book.borrowBook();
        System.out.println(member.getName() + " borrowed " + book.getTitle());
    }

    public void returnBook(String bookId, String memberId) throws Exception {
        Book book = books.get(bookId);
        if (book == null) {
            throw new Exception("Book not found");
        }
        if (!book.isBorrowed()) {
            throw new Exception("Book was not borrowed");
        }
        Member member = members.get(memberId);
        if (member == null) {
            throw new Exception("Member not found");
        }
        book.returnBook();
        System.out.println(member.getName() + " returned " + book.getTitle());
    }

    public void displayBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void displayMembers() {
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Books");
            System.out.println("6. Display Members");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String bookAuthor = scanner.nextLine();
                    library.addBook(new Book(bookId, bookTitle, bookAuthor));
                    break;
                case 2:
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    library.addMember(new Member(memberId, memberName));
                    break;
                case 3:
                    try {
                        System.out.print("Enter book ID: ");
                        bookId = scanner.nextLine();
                        System.out.print("Enter member ID: ");
                        memberId = scanner.nextLine();
                        library.borrowBook(bookId, memberId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Enter book ID: ");
                        bookId = scanner.nextLine();
                        System.out.print("Enter member ID: ");
                        memberId = scanner.nextLine();
                        library.returnBook(bookId, memberId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    library.displayMembers();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
