package ru.simple_lessons.calc.exception;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 17:42<br>
 * Ошибка связанная с ошибочным аргументом
 */
public class ArgumentException extends Exception {
	private final ErrorMessage message;

	public ArgumentException(ErrorMessage message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message.toString();
	}
}
