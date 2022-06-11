package ru.simple_lessons.calc.exception;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 17:44<br>
 * Список констант ошибок
 */
public enum ErrorMessage {
	ARGUMENT_MUST_NOT_BE_NULL("Агрумент не должен быть пустой");

	private final String value;

	ErrorMessage(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
