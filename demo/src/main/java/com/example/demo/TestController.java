package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 受oauth2包含的rest接口
 */
@RestController
@RequestMapping("/l/")
public class TestController {

    /**
     * 返回当前用户的手机号
     *
     * @param request
     * @return
     */
    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        return request.getRemoteUser();
    }

    @RequestMapping("/test1")
    public String te1st(HttpServletRequest request) {
        return "123";
    }

}
