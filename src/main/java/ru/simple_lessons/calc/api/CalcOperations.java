package ru.simple_lessons.calc.api;

import ru.simple_lessons.calc.api.dto.*;
import ru.simple_lessons.calc.exception.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 13:29<br>
 * Все основные операции для калькулятора
 * (Рекомендуется имплементировать контроллеру сервиса или клиенту другого сервиса)
 */
public interface CalcOperations {
	ResultDto plus(final ArgumentDto arg) throws ArgumentException;

	ResultDto minus(final ArgumentDto arg) throws ArgumentException;

	ResultDto division(final ArgumentDto arg) throws ArgumentException;

	ResultDto multiplication(final ArgumentDto arg) throws ArgumentException;

	ResultDto equals();
}
