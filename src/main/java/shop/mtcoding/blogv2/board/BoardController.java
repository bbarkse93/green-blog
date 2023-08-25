package shop.mtcoding.blogv2.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/user/updateForm")
    public String updateForm() {
     System.out.println("hello");
        return "user/updateForm";
    }
  
    @GetMapping("/board/{id}")
    public String detail() {
    
        return "board/detail";
    }
  
    @PostMapping("/board/{id}/delete")
    public  String delete() {
System.out.println("aslkdsgn");
    return ("/");
    }

      
    @PostMapping("/user/{id}/delete")
    public  String zxc2() {
System.out.println("aslkdsgn");
    return ("/");
    }
}
