package shop.mtcoding.blog.board;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardRepository boardRepository;

    @GetMapping("/" )
    public String index(HttpServletRequest reqeust) {
        List<Board> boardList = boardRepository.findAll();
        reqeust.setAttribute("boardList", boardList);
        return "index";
    }

    @PostMapping("/board/save")
    public String save(String username, String title, String content){
        System.out.println("username : " + username);
        System.out.println("title : " + title);
        System.out.println("content : " + content);
        return "redirect:/";
    }

    @GetMapping("/board/save-form")
    public String saveForm() {
        return "board/save-form";
    }

    @GetMapping("/board/{id}")
    public String detail(@PathVariable Integer id) {
        return "board/detail";
    }
}
