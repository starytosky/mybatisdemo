package com.liang.mybatis.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maskService/dataMask/")
@Slf4j
public class UserController {

	@GetMapping("getuser")
	public int getuser() {
		return 0;
	}
}
