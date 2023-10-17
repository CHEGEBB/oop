public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Please enter the title of the book");
        book.title = myObj.nextLine();
        System.out.println("Please enter the author name");
        book.author = myObj.nextLine();
        System.out.println("Please enter the number of pages");
        book.numberOfPages = myObj.nextInt();

        System.out.println("The book title is: " + book.title);
        System.out.println("The book author is: " + book.author);
        System.out.println("The book has : " + book.numberOfPages + " pages");
    }
}