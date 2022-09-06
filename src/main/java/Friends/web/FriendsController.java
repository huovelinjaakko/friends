package Friends.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Friends.domain.Friend;
import s22.tehtava2.domain.Student;

@Controller
public class FriendsController {
	
	@GetMapping("/index")
	public String friendForm(Model model) {
		
		ArrayList<Friend> kaverit = new ArrayList<>();
		
		//model.addAttribute("friend", new Friend());
		
		model.addAttribute("friend", kaverit);
		
		return "friends";
	}
	
	@PostMapping("/index")
	public String friendSubmit(@ModelAttribute Friend kaverit, Model model) {
		
		model.addAttribute("friend", kaverit);
		
		return "friends";
	}

}
