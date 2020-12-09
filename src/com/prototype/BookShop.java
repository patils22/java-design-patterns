package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    // every book shop has a name and the list of books in it
    String shopName;
    List<Book> listOfBooksInShop = new ArrayList<Book>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookShop1() {
        return listOfBooksInShop;
    }

    public void setBookShop1(List<Book> bookShop1) {
        this.listOfBooksInShop = bookShop1;
    }

    @Override
    public String toString() {
        return "BookShop [listOfBooksInShop=" + listOfBooksInShop + ", shopName=" + shopName + "]";
    }

    public void loadBooks() {

        for (int i = 1; i < 4; i++) {
            Book e = new Book();
            e.setBookid(i);
            e.setBookName("BOOK " + i);
            getBookShop1().add(e);
        }

    }

    @Override
    // protected method can be only be accessed through a class which is
    // in the same package
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop clonedBookShop = new BookShop();
        for (Book b: this.listOfBooksInShop){ // this (the object calling this method - shop1)
            clonedBookShop.listOfBooksInShop.add(b);
            
        }

        return clonedBookShop;
    }
     
}

