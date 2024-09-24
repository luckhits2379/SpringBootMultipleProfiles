package com.ng.springboot.profiles;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
class BookServiceTest {

	@Autowired
	BookService bookService;

	@Autowired
	private Environment env;

	@Test
	void testCreateBook() {

		System.out.println(env);

		Book book = new Book(1, "book1");

		Book createdBook = bookService.createBook(book);

		Assertions.assertThat(createdBook).isNotNull();
		Assertions.assertThat(createdBook.getBookId()).isEqualTo(1);
		Assertions.assertThat(createdBook.getBookName()).isEqualTo("book1");

	}

}
