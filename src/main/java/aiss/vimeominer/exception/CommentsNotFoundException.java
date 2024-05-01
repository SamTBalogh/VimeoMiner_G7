package aiss.vimeominer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "Comments not found with that Video Id")
public class CommentsNotFoundException extends Exception{
}
