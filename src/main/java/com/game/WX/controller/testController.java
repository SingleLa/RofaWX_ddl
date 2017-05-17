package com.game.WX.controller;

import com.game.WX.mapper.AccountMapper;
import com.game.WX.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/5/17.
 */
@Controller
public class testController {
    @Autowired
    AccountMapper accountMapper;

    @RequestMapping("test")
    @ResponseBody
    public Account test(){

        Account a = accountMapper.selectByPrimaryKey(29);
        return a;

    }
}
