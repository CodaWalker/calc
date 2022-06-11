package ru.simple_lessons.calc.api.dto;

import ru.simple_lessons.calc.model.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 16:36<br>
 * Аргумент который отправляется с сервера (Рузультат)
 */
public class ResultDto extends StateOperations<Integer> {

	/**
	 * Утилитный метод, который кастит StateOperations в ResultDto
	 */
	public static ResultDto of(StateOperations<Integer> stateOperations) {
		final ResultDto resultDto = new ResultDto();
		resultDto.setValue(stateOperations.getValue());
		return resultDto;
	}
}
