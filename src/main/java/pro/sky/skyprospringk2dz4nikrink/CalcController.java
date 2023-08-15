package pro.sky.skyprospringk2dz4nikrink;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private final CalcService calcService;

    public CalcController (CalcService calcService){
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String calculator(){
        return calcService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus (@RequestParam ("num1") Integer num1, @RequestParam ("num2") Integer num2){
        return calcService.plus(num1, num2);
    }


}
