package com.ecourse.controller;

import com.ecourse.entity.EcUser;
import com.ecourse.service.EcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tomato
 * @create 2017-12-15 下午3:47
 */
@Controller
@RequestMapping("/user")
public class EcUserController {

    @Autowired
    private EcUserService ecUserService;

    
    @RequestMapping("/login")
    public @ResponseBody Map<String, Object> ecUserLogin(ModelMap map, HttpServletRequest request) throws Exception {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String password = request.getParameter("password");
        int id = Integer.getInteger(request.getParameter("ecUserId"));
        EcUser ecUser  = ecUserService.findEcUserByLogin(id, password);
        System.out.println("ecUser的值是：---"+ password + "，当前方法=EcUserController.ecUserLogin()");
        if (ecUser != null) {
            resultMap.put("wxid", ecUser.getUserWxId());
            resultMap.put("res", "yes");
        } else {
            resultMap.put("res", "no");
        }
        return resultMap;
    }
}
