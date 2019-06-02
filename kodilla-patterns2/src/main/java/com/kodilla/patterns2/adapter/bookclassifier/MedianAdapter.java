package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> booksMap = new HashMap<>();

        for (BookA bookA : bookSet) {
            BookB bookB = new BookB(
                    bookA.getAuthor(),
                    bookA.getTitle(),
                    bookA.getPublicationYear());
            BookSignature bookSignature = new BookSignature(bookA.getSignature());
            booksMap.put(bookSignature, bookB);
        }
        return medianPublicationYear(booksMap);
    }
}
