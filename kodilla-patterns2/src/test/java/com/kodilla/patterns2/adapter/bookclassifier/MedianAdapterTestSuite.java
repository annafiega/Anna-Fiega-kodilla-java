package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter=new MedianAdapter();
        Set<Book> books=new HashSet<>();
        books.add(new Book("aaaa", "aaaa", 1980,"aaaa"));
        books.add(new Book("bbbb","bbbb", 2000,"bbbb"));
        books.add(new Book("cccc","cccc", 2010,"cccc"));
        //when
        int median =medianAdapter.publicationYearMedian(books);
        //then
        assertEquals(2000,median);
    }

}
