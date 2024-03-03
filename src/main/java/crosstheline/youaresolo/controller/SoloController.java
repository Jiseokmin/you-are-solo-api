package crosstheline.youaresolo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoloController {
    @GetMapping("/filter")
    public String filter(@RequestParam String words) {
        // 입력된 단어 중에 욕이 포함될 경우 반응 리턴
        if (words.contains("닥쳐")) {
            return "어떻게 나한테 그런말을 할 수 가 있어?? 넌 정말 0점짜리 사람이구나";
        }
        return "";
    }
}
