package ru.simple_lessons.calc.api.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import ru.simple_lessons.calc.api.*;
import ru.simple_lessons.calc.api.dto.*;
import ru.simple_lessons.calc.exception.*;
import ru.simple_lessons.calc.service.*;

import static java.text.MessageFormat.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 13:28<br>
 * Контроллер для вычисления
 */
@RestController
@RequestMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class CalcController implements CalcOperations, AdditionCalcOperations {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalcController.class);

	private final CalcService calcService;

	@Autowired
	public CalcController(CalcService calcService) {
		this.calcService = calcService;
	}

	@Override
	@PostMapping(value = "plus")
	public ResultDto plus(@RequestBody ArgumentDto arg) throws ArgumentException {
		final Integer value = arg.getValue();
		LOGGER.info(format("Operation plus: value={0}, User sender={1}", value, arg.getUserId()));
		return ResultDto.of(calcService.plus(value));
	}

	@Override
	@PostMapping(path = "minus")
	public ResultDto minus(@RequestBody ArgumentDto arg) throws ArgumentException {
		LOGGER.info(format("Operation minus: value={0},\n User sender={1}", arg.getValue(), arg.getUserId()));
		return ResultDto.of(calcService.minus(arg.getValue()));
	}

	@Override
	@PostMapping(path = "div")
	public ResultDto division(@RequestBody ArgumentDto arg) throws ArgumentException {
		LOGGER.info(format("Operation division: value={0},\n User sender={1}", arg.getValue(), arg.getUserId()));
		return ResultDto.of(calcService.division(arg.getValue()));
	}

	@Override
	@PostMapping(path = "multi")
	public ResultDto multiplication(@RequestBody ArgumentDto arg) throws ArgumentException {
		LOGGER.info(format("Operation multiplication: value={0},\n User sender={1}", arg.getValue(), arg.getUserId()));
		return ResultDto.of(calcService.multiplication(arg.getValue()));

	}

	@Override
	@GetMapping(path = "equals")
	public ResultDto equals() {
		LOGGER.info("Operation equals success");
		return ResultDto.of(calcService.equals());
	}

	@GetMapping(path = "clear")
	public void clear() {
		LOGGER.info("Operation clear success");
		calcService.clear();
	}
}
