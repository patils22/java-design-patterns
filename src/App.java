
import com.prototype.BookShop;
import com.prototype.Book;

/* Whenever you need to create objects repeatedly with same constructor parameters
and if these parameters are coming from a database,it will take be time & memory consuming.
So what we do is we create the 1st object by our own or using database, but for further objects
we make clones of the first object.
The class whose objects you need to clone must extend class Cloneable.
and method used to clone is (class name)super.clone().

Shallow Copy:  2 references pointing to same object, same hashcode
Deep Copy :    2 references pointing to different objects, different objects.

*/




public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop1 = new BookShop();      // create the object using values from database
        shop1.setShopName("Novelty");
        shop1.loadBooks();
        System.out.println(shop1 + ":" + shop1.hashCode());

        BookShop shop2 = shop1.clone();  // create the clone using the shop1 object
        shop2.setShopName("Prince");
        shop1.getBookShop1().remove(1);

        System.out.println(shop1 + ":" + shop1.hashCode());
        System.out.println(shop2 + ":" + shop2.hashCode());
    }
        
}

// line added 