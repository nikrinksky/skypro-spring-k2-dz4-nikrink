package pro.sky.skyprospringk2dz4nikrink;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Service
public class CalcServiceImpl implements CalcService{
    @Override
    public String calculator(){
        String s = "<h1 style=\"color: blue;\"> Добро пожаловать в калькулятор!</h>";
        return s;
    }

    @Override
    public String plus (Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            return "Ошибка! Отсутствует параметр.";
        }else {
        return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }
    @Override
    public String minus (Integer num1, Integer num2){

        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @Override
    public String multiply (Integer num1, Integer num2){

        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String divide (Double num1, Double num2){
        if(num2 == 0){
            return "На ноль делить нельзя";
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }


}
