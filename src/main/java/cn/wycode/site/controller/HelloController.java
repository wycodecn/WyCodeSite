package cn.wycode.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/9/9.
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


}
