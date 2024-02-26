package edu.cqu.controller;

import edu.cqu.common.Response;
import edu.cqu.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ai")
public class AIController {
    @Autowired
    AIService aiService;
    @PostMapping("/pic")
    public Response process_pic(@RequestParam String picBase64) throws Exception{
        return aiService.processPic(picBase64);
    }
}
