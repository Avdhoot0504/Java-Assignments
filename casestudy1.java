import java.util.*;

class Book{
    String title;
    String author;
    String ISBN;

    public Book(String title,String author,String ISBN){
          this.title=title;
          this.author=author;
          this.ISBN=ISBN;
    }

}

class Library{
    ArrayList<Book> books = new ArrayList<>();

    void addbook(Book b){
        books.add(b);
    }

    void searchbook(String Title){
        for(int i=0;i<books.size();i++){
            if(books.get(i).title.equals(Title)){
                System.out.println("BOOK FOUND");
                System.out.println("Title:"+books.get(i).title);
                System.out.println("Author:"+books.get(i).author);
                System.out.println("ISBN:"+books.get(i).ISBN);
            }
        }
    }

    void displayall(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Title : " + books.get(i).title);
            System.out.println("Author : " + books.get(i).author);
            System.out.println("ISBN : " + books.get(i).ISBN);
            System.out.println();
        }
    }
}

public class casestudy1{
    public static void main(String[] args) {
        Library L=new Library();
        Book b1=new Book("JAVA","James Gosling","101");
        Book b2=new Book("Python","Guido","102");
        Book b3=new Book("DBMS", "Korth", "103");

        L.addbook(b1);
        L.addbook(b2);
        L.addbook(b3);
        

        
        System.out.println("All Books");
        L.displayall();


        Scanner sc = new Scanner(System.in);
       
        System.out.println("Searching book");
        String T= sc.nextLine();
        L.searchbook(T);
        sc.close();

     }

}


