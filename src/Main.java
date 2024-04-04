import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Book kalplerinKesfi = new Book("Kalplerin Keşfi", 582, "İmam-ı Gazali");
        Book kasagi = new Book("Kaşağı", 124, "Ömer Seyfettin");
        Book doguEkspresindeCinayet = new Book("Doğu Ekspresinde Cinayet", 256, "Agatha Christie");
        Book tarihiDegistirenSavaslar = new Book("Tarihi Değiştiren Savaşlar", 491, "Ali Çimen");
        Book mimarSinan = new Book("Mimar Sinan", 190, "Yavuz Bahadıroğlu");
        Book evliyaCelebi = new Book("Evliya Çelebi", 206, "Ramazan İdol");
        Book aciKahve = new Book("Acı Kahve", 152, "Agatha Christie");
        Book olumSessizGeldi = new Book("Ölüm Sessiz Geldi", 270, "Agatha Christie");
        Book nildeOlum = new Book("Nil'de Ölüm", 334, "Agatha Christie" );
        Book padisahKissaları = new Book("Padişah Kıssaları", 347, "Alim Baki Akkoç");

        List<Book> list = new ArrayList<>();

        list.add(kalplerinKesfi);
        list.add(kasagi);
        list.add(doguEkspresindeCinayet);
        list.add(tarihiDegistirenSavaslar);
        list.add(mimarSinan);
        list.add(evliyaCelebi);
        list.add(aciKahve);
        list.add(olumSessizGeldi);
        list.add(nildeOlum);
        list.add(padisahKissaları);



        Map<String, String> booksMap = new HashMap<String, String>();

        for(Book b : list){

            booksMap.put(b.getName(), b.getAuthor());

        }



        Map<String, String> forEachBooksMap = new HashMap<String, String>();

        list.forEach(Book -> forEachBooksMap.put(Book.getName(), Book.getAuthor()));



        Map<String, String> streamBooksMap = new HashMap<String, String>();

        streamBooksMap = list.stream().collect(Collectors.toMap(Book::getName, Book::getAuthor));



        List<Book> bookThatLongerThan300 = list.stream().filter(b -> b.getPageNumber() > 300).toList();



        List<Book> bookThatLongerThan300V2 = new ArrayList<>();

        list.stream().filter(Book -> Book.getPageNumber() > 300).forEach(Book -> bookThatLongerThan300V2.add(Book));

        gap();

        list.forEach(Book -> System.out.print("\n" + Book.getName() + " / " + Book.getPageNumber()));

        gap();

        bookThatLongerThan300V2.forEach(Book -> System.out.print("\n" + Book.getName() + " / " + Book.getPageNumber()));

        gap();

        streamBooksMap.forEach((name, author) -> System.out.println("\n" + name + " / " + author));

    } 

    public static void gap(){
        System.out.println();
    }
}
