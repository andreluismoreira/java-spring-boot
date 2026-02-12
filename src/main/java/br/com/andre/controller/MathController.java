package br.com.andre.controller;

import br.com.andre.service.MathService;
import br.com.andre.utils.Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    public Utils utils = new Utils();

    public MathService math = new MathService();

    @RequestMapping("/somar/{numberOne}/{numberTwo}")
    public Double somar(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!utils.isNumeric(numberOne) || !utils.isNumeric(numberTwo)) throw new UnsupportedOperationException("please set a numeric value");
        return math.somar(utils.convertToDouble(numberOne) , utils.convertToDouble(numberTwo));
    }

    @RequestMapping("/subtrair/{numberOne}/{numberTwo}")
    public Double subtrair(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!utils.isNumeric(numberOne) || !utils.isNumeric(numberTwo)) throw new UnsupportedOperationException("please set a numeric value");
        return math.subtrair(utils.convertToDouble(numberOne) , utils.convertToDouble(numberTwo));
    }

    @RequestMapping("/multiplicar/{numberOne}/{numberTwo}")
    public Double multiplicar(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!utils.isNumeric(numberOne) || !utils.isNumeric(numberTwo)) throw new UnsupportedOperationException("please set a numeric value");
        return math.multiplicar(utils.convertToDouble(numberOne) , utils.convertToDouble(numberTwo));
    }

    @RequestMapping("/dividir/{numberOne}/{numberTwo}")
    public Double dividir(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!utils.isNumeric(numberOne) || !utils.isNumeric(numberTwo)) throw new UnsupportedOperationException("please set a numeric value");
        return math.dividir(utils.convertToDouble(numberOne) , utils.convertToDouble(numberTwo));
    }

    @RequestMapping("/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!utils.isNumeric(numberOne) || !utils.isNumeric(numberTwo)) throw new UnsupportedOperationException("please set a numeric value");
        return math.media(utils.convertToDouble(numberOne) , utils.convertToDouble(numberTwo));
    }

    @RequestMapping("/raiz/{number}")
    public Double raiz(@PathVariable("number") String number) {
        if (!utils.isNumeric(number)) throw new UnsupportedOperationException("please set a numeric value");
        return math.raiz(utils.convertToDouble(number));
    }


}
