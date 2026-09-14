class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook() {
        int booksToIssue = 1;

        if (booksAvailable >= booksToIssue) {
            booksAvailable = booksAvailable - booksToIssue;
            System.out.println("Book Issued Successfully");
            System.out.println("Books Available: " + booksAvailable);
        } else {
            System.out.println("No books available.");
        }
    }

    void returnBook() {
        int booksToReturn = 1;

        booksAvailable = booksAvailable + booksToReturn;

        System.out.println("Book Returned Successfully");
        System.out.println("Books Available: " + booksAvailable);
    }
}

public class ques30 {
    public static void main(String[] args) {
        Library library = new Library(10);

        System.out.println("Library: " + Library.libraryName);
        System.out.println("Initial Books Available: "
                + library.booksAvailable);

        library.issueBook();
        library.returnBook();
    }
}
