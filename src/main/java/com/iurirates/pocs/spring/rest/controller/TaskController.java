package com.iurirates.pocs.spring.rest.controller;

import com.iurirates.pocs.spring.rest.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "test", value = "test")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @ApiOperation("test")
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String getTasks() {
        return taskService.getTasks();
    }
}
