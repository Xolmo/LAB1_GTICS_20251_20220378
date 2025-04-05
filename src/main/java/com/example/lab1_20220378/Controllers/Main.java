package com.example.lab1_20220378.Controllers;
import com.example.lab1_20220378.Beans.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
    @RequestMapping(value = "/pedido", method = RequestMethod.GET)
    public String pedido() {
        return "home";
    }

    @PostMapping("/pedido/guardar")
    public String guardarPedido(Pedido pedido) {

        int total = (10 +12 + 13)pedido.getCantidad()
        return "home";
    }

}