package com.test.controller;

import com.test.entity.Student;
import com.test.mapper.MainMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MainController {

    @Resource
    MainMapper mapper;

    @RequestMapping("index")
    public String index() {
        Logger logger = LoggerFactory.getLogger(MainController.class);
        logger.info("我是新建的日志信息");
        return "index";
    }

    @RequestMapping("student")
    @ResponseBody
    public Student student() {
        Student student = mapper.findStudentBySid(21);
        return student;
    }
}
