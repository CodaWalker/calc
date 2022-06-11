package ru.simple_lessons.calc.service;

import ru.simple_lessons.calc.exception.*;
import ru.simple_lessons.calc.model.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 13:08<br>
 * Основные операции для сервиса работы с операциями калькулятора
 */
public interface CalcService {

	StateOperations<Integer> plus(final Integer arg) throws ArgumentException;

	StateOperations<Integer> minus(final Integer arg) throws ArgumentException;

	StateOperations<Integer> multiplication(final Integer arg) throws ArgumentException;

	StateOperations<Integer> division(final Integer arg) throws ArgumentException;

	StateOperations<Integer> equals();

	void clear();
}
