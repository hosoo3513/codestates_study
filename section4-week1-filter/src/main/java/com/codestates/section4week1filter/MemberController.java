package com.codestates.section4week1filter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MemberController {
    @GetMapping("/abc")
    public String regmem() {
        return null;
    }
}
