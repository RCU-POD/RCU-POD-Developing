package com.rcu.conffebeneffits;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;

@Controller
public class myErrorController implements ErrorController {
	
	//This two methods are related to the main page "index.html" where is all the content about coffeebenefits
	@RequestMapping("/")
	public String HandleError(HttpServletRequest request)
	{
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if(status != null)
		{
			Integer statusCode = Integer.valueOf(status.toString());
			
			if(statusCode == HttpStatus.NOT_FOUND.value())
			{
				return "/error/error-404";
			}
			else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value())
			{
				return "/error/error-500";
			}
		}
		else
		{
			return "../static/index";
		}
		return "error";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
	
	//This two methods
	@RequestMapping("/error")
	public String HandleError2(HttpServletRequest request)
	{
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if(status != null)
		{
			Integer statusCode = Integer.valueOf(status.toString());
			
			if(statusCode == HttpStatus.NOT_FOUND.value())
			{
				return "/error/error-404";
			}
			else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value())
			{
				return "/error/error-500";
			}
		}
		return "error";
	}
	
	public String getErrorPath2()
	{
		return "/error";
	}
}
