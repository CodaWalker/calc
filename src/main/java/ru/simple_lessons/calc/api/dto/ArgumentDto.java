package ru.simple_lessons.calc.api.dto;

import com.fasterxml.jackson.annotation.*;
import ru.simple_lessons.calc.model.*;

import java.io.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 16:36<br>
 * Аргумент который отправляется с клиента
 */
public class ArgumentDto extends StateOperations<Integer> implements Serializable {

	/**
	 * ID пользователя, который произвел операцию
	 */
  	private final Long userId;

	public ArgumentDto(@JsonProperty("userId") Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

}
