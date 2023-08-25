package shop.mtcoding.blogv2.reply;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.blogv2._core.util.ApiUtil;

@Controller
public class ReplyController {
    @PostMapping("/api/reply/save")
    public @ResponseBody ApiUtil<String> save() {
        // System.out.println("boardId: " + saveDTO.getBoardId());
        // System.out.println("comment: " + saveDTO.getComment());
        System.out.println("댓글 작성");
        return new ApiUtil<String>(true, "댓글쓰기 성공");
    }
}
