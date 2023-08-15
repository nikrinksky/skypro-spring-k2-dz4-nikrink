package pro.sky.skyprospringk2dz4nikrink;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalcServiceImpl implements CalcService{

    public String calculator(){
        String s = "<h1 style=\"color: blue;\"> Добро пожаловать в калькулятор!</h>";
        return s;
    }


    public String plus (Integer num1, Integer num2){
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }
}
