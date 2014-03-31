/**
 * 
 */
package com.barun.onlinenationalpolling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.barun.onlinenationalpolling.beans.User;

/**
 * @author sakhi
 *
 */
@Controller

public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody User logIn(@PathVariable("user") User user){
		if("sakhi".equalsIgnoreCase(user.getUserName()) && "dell".equals(user.getPassword())){
			user.setResult(true);
			return user;
		} else {
			user.setResult(false);
			return user;
		}
	}
}
