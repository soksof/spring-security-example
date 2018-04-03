package eu.codschool.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import eu.codschool.jpa.entity.Director;
import eu.codschool.jpa.service.DirectorService;

@Controller
public class DirectorController {
	@Autowired
	private DirectorService directorService;

	@RequestMapping(value = "/director/view", method = RequestMethod.GET)
	public ModelAndView viewPerson(@ModelAttribute("director") Director d) {
		return new ModelAndView("director/view", "director", d);
	}

	@RequestMapping(value = "/director/list", method = RequestMethod.GET)
	public String getDirectorList(Model model) {
		List<Director> directors = directorService.findAll();
		model.addAttribute("directors", directors);
		return "fragments/directors";
	}

	@RequestMapping(value = "/director", method = RequestMethod.GET)
	public ModelAndView newPerson() {
		return new ModelAndView("director/form", "director", new Director());
	}

	@RequestMapping(value = "/director", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("director") Director d, BindingResult result, ModelMap model) {
		if (d.getName().trim().length() == 0) {
			result.rejectValue("name", "empty", "The director name cannot be empty!");
		}

		if (result.hasErrors()) {
			return "error/director";
		}
		directorService.save(d);
		model.addAttribute("message", "Director saved successfuly");
		model.addAttribute("director", d);
		return "director/view";
	}
}