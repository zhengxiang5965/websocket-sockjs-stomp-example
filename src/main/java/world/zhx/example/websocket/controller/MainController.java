package world.zhx.example.websocket.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

    @GetMapping("/index")
    public String index(Model m){
        return "index";
    }
}
