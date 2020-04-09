package life.majiang.community.controller;

import life.majiang.community.dto.PaginationDTO;
import life.majiang.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
    首页页码配置
 */
@Controller
public class IndexController {


    @Autowired
    private QuestionService questionService;

    //page 页数
    //size 一页几个问题
    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5") Integer size
                        ){

        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
