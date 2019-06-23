package com.mpatric.mp3agic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UnsupportedTagExceptionTest {

	@Test
	public void defaultConstructor() {
		com.mpatric.mp3agic.UnsupportedTagException exception = new com.mpatric.mp3agic.UnsupportedTagException();
		assertNull(exception.getMessage());
		assertNull(exception.getCause());
	}

	@Test
	public void constructorWithMessage() {
		com.mpatric.mp3agic.UnsupportedTagException exception = new com.mpatric.mp3agic.UnsupportedTagException("A message");
		assertEquals("A message", exception.getMessage());
		assertNull(exception.getCause());
	}

	@Test
	public void constructorWithMessageAndCause() {
		Throwable exceptionCause = new IllegalArgumentException("Bad argument");
		com.mpatric.mp3agic.UnsupportedTagException exception = new com.mpatric.mp3agic.UnsupportedTagException("A message", exceptionCause);
		assertEquals("A message", exception.getMessage());
		assertEquals(exceptionCause, exception.getCause());
	}
}
