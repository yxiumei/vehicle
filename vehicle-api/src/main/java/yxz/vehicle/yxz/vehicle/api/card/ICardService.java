package yxz.vehicle.yxz.vehicle.api.card;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yxz.vehicle.model.entity.CardInfo;


/**
 * @author yangxiumei
 * @date 2021/5/4 16:05
 */
@RestController
@Api(tags = "车信息")
@RequestMapping("/center/calculation")
public interface ICardService {

    @ApiOperation("通过手机号查询车辆信息")
    @GetMapping("/getOneCardInfoByPhone")
    CardInfo getOneCardInfoByPhone(@RequestParam String phone);

    @ApiOperation("通过手机号查询车辆信息")
    @GetMapping("/getOneById")
    CardInfo getOneById(@RequestParam Long id);
}
