package shop.mtcoding.bankapp.handler.ex;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    private HttpStatus status; // 상태코드

    public CustomException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

}
