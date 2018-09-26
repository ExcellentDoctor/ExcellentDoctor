package com.tpkd.consumer.controller;


import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Image;
import com.tpkd.common.pojo.User;
import com.tpkd.common.util.*;
import com.tpkd.common.vo.user.LoginVo;
import com.tpkd.common.vo.user.RegisterVo;
import com.tpkd.consumer.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


/**
 * @author jyk
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;


    @Resource
    private UploadUtil uploadUtil;
    /**
     * 短信验证码验证是否正确的注册
     * @param registerVo
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Dto addUser(RegisterVo registerVo, @RequestParam("file") MultipartFile file, HttpServletRequest request){
        registerVo.setPassword(MD5Utils.getMD5(registerVo.getPassword(),20));
        String activeCode = (String) redisUtil.get("active:"+registerVo.getPhoneNumber());



        Image image = new Image();
        if (null != file) {
            String path = request.getSession().getServletContext().getRealPath("/statics" + File.separator + "headImg");
            String imageUrl= null;
            try {
                imageUrl = uploadUtil.getUrl(file,path);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(imageUrl.equals(UploadUtil.TypeFail)){
                return DtoUtil.getFailed("上传格式错误","1001");
            }
            image.setImageUrl(imageUrl);
        }


        if (!EmptyUtil.isEmpty(activeCode) && registerVo.getActiveCode().equals(activeCode)){
            if (userService.addUser(registerVo)){
                return DtoUtil.getSuccess("注册成功!");
            }else {
                return DtoUtil.getFailed("注册失败！","10001");
            }
        }
        return DtoUtil.getSuccess();
    }


    /**
     * 发送短信验证码
     * @param phoneNum
     * @return
     */
    @RequestMapping(value = "/sendActiveCode",method = RequestMethod.POST)
    public Dto sendMsg(String phoneNum) {
        userService.SendPhoneMsg(phoneNum);
        return DtoUtil.getSuccess("短信发送成功，请在30分钟内填写。");
    }



    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Dto login(LoginVo loginVo) {

        if (EmptyUtil.isEmpty(loginVo.getPhoneNumber()) || EmptyUtil.isEmpty(loginVo.getPassword())){
            return DtoUtil.getFailed("用户名或密码不能为空！","10002");
        }
        loginVo.setPassword(MD5Utils.getMD5(loginVo.getPassword(),20));
        User user  = userService.login(loginVo);
        if (EmptyUtil.isEmpty(user)){
            return DtoUtil.getFailed("账号或密码错误！","10003");
        }
        return DtoUtil.getSuccess("登录成功",user);
    }


}
