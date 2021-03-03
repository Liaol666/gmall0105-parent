package com.zll.gmall0105.gmall0105.logger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoggerController
 * @Description TODO
 * @Author 17588
 * @Date 2021-03-03 23:11
 * @Version 1.0
 */
//@Controller
@RestController
public class LoggerController {
    @RequestMapping("/applog")
    public String log(@RequestBody String log) {
        System.out.println(log);
        return log;
    }
}
