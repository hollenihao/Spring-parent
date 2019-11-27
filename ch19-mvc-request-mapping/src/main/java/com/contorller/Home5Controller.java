package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class Home5Controller {
    /**\\斜杠转义：d：代表填写数字
     *
     * @return
     */
    @GetMapping("/list/page/{pag:\\d}")
    public String post(){

        return "flow";
    }

}
