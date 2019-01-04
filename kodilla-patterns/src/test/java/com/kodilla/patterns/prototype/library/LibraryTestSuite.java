package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //given
        Library library=new Library("List 1");
        Book book1=new Book("Lalki w ogniu", "Paulina Wilk", LocalDate.of(2011,02,15));
        Book book2=new Book("Modlitwa o deszcz", "Wojciech Jagiellski", LocalDate.of(2003,01,01));
        Book book3=new Book("Długi film o miłości. Powrót na Broad Peak", "Jacek Hugo-Bader", LocalDate.of(2015,01,01));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary=null;
        try {
            clonedLibrary=library.shallowCopy();
            clonedLibrary.setName("List 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary =null;
        try{
            deepClonedLibrary=library.deepCopy();
            deepClonedLibrary.setName("List 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

       //when
        library.getBooks().remove(book1);

       //then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,clonedLibrary.getBooks().size());
        Assert.assertEquals(3,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
