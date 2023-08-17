package pro.sky.skyprospringk2dz4nikrink;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String calculator() {
        return calcService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        return calcService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calcService.divide(num1, num2);
    }
}
