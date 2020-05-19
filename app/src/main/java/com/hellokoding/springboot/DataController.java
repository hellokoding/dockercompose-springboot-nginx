package com.hellokoding.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

    @RequestMapping(method = RequestMethod.GET, value = "/data/{id}")
    public Data getData(@PathVariable Integer id) {
        return new Data();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/data")
    public Data saveData(Data data) {
        return data;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/data/{id}")
    public Data updateData(@PathVariable Integer id, Data data) {
        return data;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/data/{id}")
    public void deleteData(@PathVariable Integer id) {
    }
}