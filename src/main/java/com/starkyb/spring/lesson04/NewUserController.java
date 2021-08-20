package com.starkyb.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starkyb.spring.lesson04.bo.NewUserBO;
import com.starkyb.spring.lesson04.model.NewUser;

@RequestMapping("/lesson04")
@Controller
public class NewUserController {
	@Autowired
	private NewUserBO newUserBO;
	
	@RequestMapping("/ex01/1")
	public String addUserView() {
		return "lesson04/addUser";
	}
	
//	@RequestMapping(method=RequestMethod.POST, path="/ex01/add_user")
	@PostMapping("/ex01/add_user")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam("introduce") String introduce
			, @RequestParam("email") String email) {
		int count = newUserBO.addUser(name, yyyymmdd, introduce, email);
		return "입력 성공 : " + count;								
	}
	
	//가장 최근에 등록된 사용자 정보 출력
	 @GetMapping("/ex01/2")
//	 @ResponseBody
	 public String lastUser(Model model) {	//view (.jsp)에 데이터를 전달하는 매개체
		 NewUser user = newUserBO.getLastUser();
		 model.addAttribute("result", user);
		 model.addAttribute("subject", "회원정보");
		 
//		 return newUserBO.getLastUser();
		 return "lesson04/userInfo";
	 }
	 
	 
}
