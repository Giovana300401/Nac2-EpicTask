package br.com.fiap.EpicTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskRepository respository;

	@GetMapping
	public ModelAndView tasks() {
		
	}
}
