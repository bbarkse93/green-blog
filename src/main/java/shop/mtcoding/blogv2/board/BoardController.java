package shop.mtcoding.blogv2.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @GetMapping("/user/updateForm")
    public String updateForm() {
     
        return "user/updateForm";
    }

    @PostMapping("/board/{id}/delete")
    public  String delete() {

    return ("/");
    }


}
