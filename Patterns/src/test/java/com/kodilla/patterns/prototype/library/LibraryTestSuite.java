package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Św. Czesława");
        Book panKleks = new Book("Akademia Pana Kleksa", "Jan Brzechwa", LocalDate.of(1980, 7, 12));
        Book hobbit = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", LocalDate.of(1937, 2, 26));
        Book wPustyniIWPusczy = new Book("W Pustyni i Puszczy", "Henryk Sienkiewicz", LocalDate.of(1911, 12, 24));

        library.getBooks().add(panKleks);
        library.getBooks().add(hobbit);
        library.getBooks().add(wPustyniIWPusczy);

        //Shallow Clone
        Library libraryShallowClone = null;
        try {
            libraryShallowClone = library.shallowClone();
            libraryShallowClone.setName("Poplińskich");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Deep Clone
        Library libraryDeepClone = null;
        try {
            libraryDeepClone = library.deepClone();
            libraryDeepClone.setName("Wierzbięcice");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(hobbit);
        System.out.println(library);
        System.out.println(libraryShallowClone);
        System.out.println(libraryDeepClone);
        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, libraryShallowClone.getBooks().size());
        Assert.assertEquals(3, libraryDeepClone.getBooks().size());

    }
}