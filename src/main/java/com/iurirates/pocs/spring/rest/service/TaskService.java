package com.iurirates.pocs.spring.rest.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TaskService {

    public String getTasks() {
        return "taskRepository";
    }

}
