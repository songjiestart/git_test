package com.songjie.benmu.songjie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: songjie
 * @Date: 2019-04-28 11:15
 * @Description:
 */
@RequestMapping("/door")
public class DoorController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/success")
    public String success(){
        logger.info("logger in success!");
        System.out.println("开始验证");
        System.out.println("开始验证2019-1");
        System.out.println("开始验证2019-1");
        System.out.println("开sdfasdfaf");
        System.out.println("开sdfasdfdaf");
        System.out.println("开sdfadf");
        System.out.println("开adsfadsfasdfsdf");
        System.out.println("开始验证2019-1");
        System.out.println("开始验证2019-1");
        System.out.println("开始验证2019-1");
        System.out.println("开始验证2019-1");
        return "success";
    }

}
