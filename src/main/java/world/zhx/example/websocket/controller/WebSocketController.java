package world.zhx.example.websocket.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import world.zhx.example.websocket.common.Const;
import world.zhx.example.websocket.common.WebSocketUtils;
import world.zhx.example.websocket.vo.WebSocketRequest;
import world.zhx.example.websocket.vo.WebSocketResponse;

import static world.zhx.example.websocket.common.Const.EXAMPLE_P2P_USER;

@Controller
public class WebSocketController {


    @Autowired
    WebSocketUtils webSocketUtils;

    @MessageMapping(Const.FORE_TO_SERVER_PATH)//@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @SendTo(Const.PRODUCER_PATH)//如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    public WebSocketResponse say(WebSocketRequest message) throws Exception {
        //List<String> users = new ArrayList<>();
        //users.add(EXAMPLE_P2P_USER);//此处写死只是为了方便测试,此值需要对应页面中订阅个人消息的userId
        webSocketUtils.send2User(EXAMPLE_P2P_USER, new WebSocketResponse("1","admin hello"));

        return new WebSocketResponse("1","Welcome, " + message.getName() + "!");
    }
}
