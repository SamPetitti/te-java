package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping({"/", "/actorList"})
	public String showSearchActorForm() {
		return "actorList";
	}

	/* What about here? */
	@RequestMapping("/searchActors")
	public String showSearchActorResult(HttpServletRequest request) {
		/* Call the model and pass values to the jsp */
		String actor = request.getParameter("actor");
		List <Actor> actors = actorDao.getMatchingActors(actor);
		request.setAttribute("actors", actors);
		return "actorList";
	}
}


