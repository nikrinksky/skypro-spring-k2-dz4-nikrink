package pro.sky.skyprospringk2dz4nikrink;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public String calculator() {
        return "<h1 style=\"color: blue;\"> Добро пожаловать в калькулятор!</h1>";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h2 style=\"color: red;\"> Ошибка! Отсутствует(ют) параметр(ы).<h2>";
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        double sum;
        if (num2 == 0) {
            return "<h2 style=\"color: red;\">ВНИМАНИЕ! На ноль делить нельзя</h2>";
        } else {
            if (num1 % num2 == 0) {
                return num1 + " / " + num2 + " = " + (num1 / num2);
            } else {
                sum = num1 / (double) num2;
                return num1 + " / " + num2 + " = " + sum;
            }
        }
    }
}
