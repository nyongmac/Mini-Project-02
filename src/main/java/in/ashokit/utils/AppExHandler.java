package in.ashokit.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExHandler {
	
	@ExceptionHandler(value=Exception.class)
	public String handleEx(Exception e) {
		
		return "errorPage";
	}

}
