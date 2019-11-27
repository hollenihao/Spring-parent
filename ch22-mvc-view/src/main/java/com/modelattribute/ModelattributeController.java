package com.modelattribute;

import com.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelattributeController {
/**
 *当modelAttribute修饰方法时，在没个方法请求前会先执行
 * 执行完毕之后，会把方法的返回对象放到model对象中
 *键的名字是返回对象的类名首字母小写，值是返回对象
 *
 *
 */

@ModelAttribute
    public UserVo init(){
        UserVo vo = new UserVo();
        vo.setUsername("init");
        return vo;
}
@RequestMapping("/")
    public String demo(UserVo vo , Model model){

    return  "index";
        }

    /**
     *当modelAttribute出现在参数时
     * 1.从model中找数据赋值给这个值
     *2.依据ModelAttribute设置的键去找
     *3.如果ModelAttribute没有设置键，就会依据参数类型的名字去找
     *4如果还没有找到就实例化一个参数对象，并放入Model
     *
     *
     * binding=false是阻止数据绑定
     * @param vo
     * @param model
     * @return
     */
        @RequestMapping("/demo2")
    public String demo2(@ModelAttribute(value = "abc" ,binding = false) UserVo vo, Model model){
                return  "model";
        }

}
