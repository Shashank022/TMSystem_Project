package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.service.TeamService;

@Controller
public class TeamController {
	
	
	@Autowired
	TeamService teamService;
	

	@RequestMapping(value = "/teamlist", method = RequestMethod.GET)
	public String getAlllistofEvents(ModelMap model) {
		model.addAttribute("teams", teamService.getListofTeams());
		return "teams";
	}

}
