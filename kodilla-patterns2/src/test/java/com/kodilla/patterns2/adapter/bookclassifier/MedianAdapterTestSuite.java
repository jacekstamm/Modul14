package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        BookA wPustyni = new BookA("XYZ", "W Pustyni i Puszczy", 1666, "1111");
        BookA dzieci = new BookA("ZMT", "Dzieci", 2015, "1112");
        BookA acerola = new BookA("KTL", "Acerola", 2006, "1254");
        BookA bosch = new BookA("LTM", "Bosch", 1957, "1574");
        BookA thule = new BookA("ZRL", "Thule", 1976, "1976");

        Set<BookA> booksSet = new HashSet<>();
        booksSet.add(wPustyni);
        booksSet.add(dzieci);
        booksSet.add(acerola);
        booksSet.add(bosch);
        booksSet.add(thule);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(booksSet);

        //Then
        Assert.assertEquals(1976, median);
    }
}
