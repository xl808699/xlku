package com.cssl.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import com.cssl.vo.UsersVo;


@SessionAttributes(types=UsersVo.class, names="usersVo")
@Controller
public class HelloController {
	
	
	public HelloController() {
		System.out.println("HelloController构造"+this);
	}

	@Autowired
	private UsersService service;
		
	@RequestMapping("/page/{pageIndex}/{pageSize}")
	public String query(
			@PathVariable Integer pageIndex,
			@PathVariable Integer pageSize,Model model) {
		List<Users> list = service.findAll(pageIndex, pageSize);
		model.addAttribute("list", list);
		return "success";
	}

	/**
	 * 返回值就是逻辑视图名，
	 * 参数保存在请求作用域，默认类名首字母小写作为key
	 * @param uvo
	 * @return
	 */	
	@PostMapping("/regist.html")
	public String regist(UsersVo uvo) {
//		System.out.println("regist:"+uvo.getUsername()+"\t"+uvo.getPassword());
		
		//vo->pojo
		Users user = new Users();
		BeanUtils.copyProperties(uvo, user);
		
		if(service.saveUsers(user)) {		
			return "success";
		}			
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello:");
		return "forward:/success.jsp";
	}

}
