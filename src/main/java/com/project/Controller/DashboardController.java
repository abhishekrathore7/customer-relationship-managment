package com.project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class DashboardController {
	@RequestMapping(value="/Dashboard", method = RequestMethod.GET)
	public String showAdminDashboardPage() {
		return "Dashboard";
	}
}
