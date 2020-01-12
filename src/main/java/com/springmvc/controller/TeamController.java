package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TeamController extends BaseController{
	
	@RequestMapping(value = "/teamlist", method = RequestMethod.GET)
	public String getAlllistofEvents(ModelMap model) {
		model.addAttribute("teams", teamService.getListofTeams());
		return "teams";
	}

}
