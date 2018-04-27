package cn.liubiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/string")
    @ResponseBody
    public String getDtring(@RequestParam("string") String string){
        return string;
    }
}
