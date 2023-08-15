package pro.sky.skyprospringk2dz4nikrink;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalcService {
    String calculator();
    String plus (Integer num1, Integer num2);
}
