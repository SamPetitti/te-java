package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class ReviewController {

@Autowired ReviewDao reviewDao;

	@RequestMapping({"/","/reviewHomePage"})
	public String displayHomePage(HttpServletRequest request) {
		List<Review> reviews = reviewDao.getAllReviews();
		request.setAttribute("reviews", reviews);
		return "reviewHomePage";
	}
}
