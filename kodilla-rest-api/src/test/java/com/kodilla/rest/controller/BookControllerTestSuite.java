package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTestSuite {

    @Test
    void shouldFetchBooks() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title1", "Author1"));
        booksList.add(new BookDto("Title2", "Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBookToList() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("title", "author");

        bookController.addBook(bookDto);

        Mockito.verify(bookServiceMock).addBook(bookDto);
    }

}