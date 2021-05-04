package xyz.vehicle.web.controller;

import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.vehicle.web.client.CardService;
import yxz.vehicle.model.entity.CardInfo;

@Api(tags = "前台用户登录时需要访问的接口")
@RestController
@RequestMapping("/web/user")
public class LoginController {

    @Autowired(required = false)
    private CardService cardService;

    @ApiOperation("尝试登录")
    @GetMapping("/login")
    public void login(@RequestParam String phone) {
        System.out.println("请求的参数是:"+phone);
        CardInfo oneCardInfo = cardService.getOneCardInfoByPhone(phone);
        if (oneCardInfo == null) {
            throw new RuntimeException("找不到对应的手机号");
        }
        StpUtil.setLoginId(oneCardInfo.getId());
    }

    @ApiOperation("获取当前登录用户或车的信息")
    @GetMapping("/info")
    public CardInfo info() {
        long cardId = StpUtil.getLoginIdAsInt();
        return cardService.getOneById(cardId);
    }

}
