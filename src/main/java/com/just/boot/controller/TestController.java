package com.just.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
@Api("测试swagger接口")
public class TestController {

    @RequestMapping(path = "/getStudent",method = RequestMethod.GET)
    @ApiOperation("/根据学生id获取学生信息")
    @ApiImplicitParam(name = "id",value = "id",required = true,paramType = "query",dataType = "int")
    public String getStudent(@RequestParam Integer id){
        return String.valueOf(id);
    }
}
