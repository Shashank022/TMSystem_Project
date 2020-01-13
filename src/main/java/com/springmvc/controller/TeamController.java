package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.Team;

@Controller
public class TeamController extends BaseController{
	
	@RequestMapping(value = "/teamlist", method = RequestMethod.GET)
	public String getAlllistofTeams(ModelMap model) {
		model.addAttribute("teams", teamService.getListofTeams());
		return "teams";
	}

	@RequestMapping(value = "/updateteam", method = RequestMethod.GET)
	public String updateEvent(@RequestParam int id, ModelMap model, @Valid Team team, BindingResult result) {
		Team teamBet = teamService.getDetailsofTeam(id);
		model.addAttribute("team", teamBet);
		return "addteam";
	}

//	
//	@RequestMapping(value = "/update-event", method=RequestMethod.POST)
//	public String updateExsistingEvent(@Valid Event event, BindingResult result) {
////		if(result.hasErrors()) {
////			return "redirect:eventlist";
////		}
//		eventService.updateEvent(event);
//		return "redirect:eventlist";
//	}
	
}
