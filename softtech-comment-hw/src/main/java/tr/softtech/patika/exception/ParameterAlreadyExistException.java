package tr.softtech.patika.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ParameterAlreadyExistException extends RuntimeException {
    public ParameterAlreadyExistException(String errorMessage) {
        super(errorMessage);
    }
}
