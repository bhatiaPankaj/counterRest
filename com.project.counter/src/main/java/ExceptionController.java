package spring.rest.astroappservices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import spring.dto.ApiResponseDTO;
import spring.util.InvalidClientException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = InvalidClientException.class)
    public ResponseEntity exception(InvalidClientException exception) {
        return new ApiResponseDTO().send(HttpStatus.OK, true );
    }

}