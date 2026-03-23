//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Джон", "Толкиен");
        System.out.println("Автор 1: " + tolkien);
        Author perumov = new Author("Ник", "Перумов");
        System.out.println("Автор 2: " + perumov);

        Book bookOne = new Book("Властелин колец", tolkien, 1955);

        Book bookTwo = new Book("Война мага", perumov, 2008);
        System.out.println("Книга 1: " + bookOne);
        System.out.println("Книга 2: " + bookTwo);

        bookTwo.year = 2010;
        System.out.println("Книга 2: " + bookTwo);

    }
}