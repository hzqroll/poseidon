package com.roll.poseidon.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.roll.poseidon.api.pojo.User;

/**
 * Created by haozq
 * Date: 2018/6/4 下午5:50
 */
@RequestMapping("/demo1-server")
public interface UserService {

	@RequestMapping("get")
	User get(@RequestParam("uid") Long uid);

	void add(@RequestParam("name") String name, @RequestParam("score") Long score);
}
