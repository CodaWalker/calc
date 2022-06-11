package ru.simple_lessons.calc.model;

import org.springframework.stereotype.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 13:18<br>
 * Обьект результата
 */
@Component
public class StateOperations<T> {
	/**
	 * Значение операций
	 */
 	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
