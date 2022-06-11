package ru.simple_lessons.calc.service;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import ru.simple_lessons.calc.exception.*;
import ru.simple_lessons.calc.model.*;

import javax.annotation.*;

import static ru.simple_lessons.calc.exception.ErrorMessage.*;

/**
 * User: Kasya<br>
 * Date: 11.06.2022<br>
 * Time: 13:15<br>
 * Сервис для выполнения оперций по калькулированию
 */
@Service
public class CalcServiceImpl implements CalcService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalcServiceImpl.class);

	@Autowired
	private final StateOperations<Integer> stateOperations;

	public CalcServiceImpl(StateOperations<Integer> stateOperations) {
		this.stateOperations = stateOperations;
	}

	@PostConstruct
	private void init() {
		clear();
	}

	@Override
	public StateOperations<Integer> plus(final Integer arg) throws ArgumentException {
		validateArgument(arg);
		this.stateOperations.setValue(this.stateOperations.getValue() + arg);
		return equals();
	}

	@Override
	public StateOperations<Integer> minus(final Integer arg) throws ArgumentException {
		validateArgument(arg);
		stateOperations.setValue(stateOperations.getValue() - arg);
		return equals();
	}

	@Override
	public StateOperations<Integer> multiplication(final Integer arg) throws ArgumentException {
		validateArgument(arg);
		stateOperations.setValue(stateOperations.getValue() * arg);
		return equals();
	}

	@Override
	public StateOperations<Integer> division(final Integer arg) throws ArgumentException {
		validateArgument(arg);
		stateOperations.setValue(stateOperations.getValue() / arg);
		return equals();
	}

	@Override
	public StateOperations<Integer> equals() {
		return stateOperations;
	}

	@Override
	public void clear() {
		stateOperations.setValue(0);
	}

	private void validateArgument(Integer arg) throws ArgumentException {
		if(arg == null){
			throw new ArgumentException(ARGUMENT_MUST_NOT_BE_NULL);
		}
	}
}
