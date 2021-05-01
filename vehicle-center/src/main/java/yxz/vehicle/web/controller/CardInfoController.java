package yxz.vehicle.web.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yxz.vehicle.model.entity.CardInfo;
import yxz.vehicle.model.service.impl.CardInfoServiceImpl;
import java.util.Optional;

@Api(tags = "前台用户_车信息")
@RestController
@RequestMapping("/center/card")
public class CardInfoController {

    @Autowired
    CardInfoServiceImpl cardInfoService;

    @ApiOperation("根据手机号获取一个车的信息")
    @PostMapping("/getOneByPhone")
    public CardInfo fun1(String phone) {
        System.out.println("进入获取车信息接口"+phone);
        Optional<CardInfo> opt = cardInfoService.lambdaQuery()
                .eq(CardInfo::getPhone, phone)
                .oneOpt();
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    @ApiOperation("根据id获取一个车的信息")
    @PostMapping("/getOneById")
    public CardInfo fun2(Integer cardId) {
        return cardInfoService.getById(cardId);
    }

}
