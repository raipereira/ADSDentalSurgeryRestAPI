package CS489.miu.citylibrarywebapi.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotElementFoundException extends RuntimeException {
    public NotElementFoundException(String message) {
        super(message);
    }
}
