package com.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("emp")
public class Home4Controller {

    /**
     * 等于旧版@requestMapping （RequestMethod.GET）
     * 用于简化spring
     * @return
     */
    @GetMapping("/get")
    public String getHome(){
        return  "flow";
    }
//请求post，同上
    @PostMapping("/post")
    public String post(){
        return "flow";
    }

    //用来删除
    @DeleteMapping("/delete")
    public String delete(){
return "flow";
    }
    @PutMapping("/put")
    public String put(){
        return "flow";
    }

    //Patch方式是对put方式的一种补充;
    //put方式是可以更新.但是更新的是整体.patch是对局部更新
    @PatchMapping("/patch")
    public String patch(){
        return "flow";
    }

}
