package yxz.vehicle.center.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yxz.vehicle.center.service.ICardInfoService;
import yxz.vehicle.model.entity.CardInfo;
import yxz.vehicle.yxz.vehicle.api.card.ICardService;

import java.util.List;
import java.util.Optional;

/**
 * @author yangxiumei
 * @date 2021/5/4 16:10
 */
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements ICardService {


    private final ICardInfoService cardInfoService;

    @Override
    public CardInfo getOneCardInfoByPhone(String phone) {
        Optional<CardInfo> opt = cardInfoService.lambdaQuery()
                .eq(CardInfo::getPhone, phone)
                .oneOpt();
        return opt.orElse(null);
    }

    @Override
    public CardInfo getOneById(Long id) {
        return cardInfoService.getById(id);
    }

    @Override
    public List<CardInfo> getAllCards() {
        List<CardInfo> list = cardInfoService.list();
        return list;
    }

}
