package world.zhx.example.websocket.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import world.zhx.example.websocket.vo.WebSocketResponse;

import java.util.List;

@Component
public class WebSocketUtils {

    @Autowired
    private SimpMessagingTemplate template;

    /**
     * 广播
     * 发给所有在线用户
     *
     * @param msg 要发送的信息
     */
    public void sendMsg(WebSocketResponse msg) {
        template.convertAndSend(Const.PRODUCER_PATH, msg);
    }

    /**
     * 发送给指定用户们
     * @param users 用户列表
     * @param msg 要发送的信息
     */
    public void send2Users(List<String> users, WebSocketResponse msg) {
        users.forEach(userName -> {
            template.convertAndSendToUser(userName, Const.P2P_PUSH_PATH, msg);
        });
    }

    /**
     * 发送给指定用户
     * @param userName 用戶名
     * @param msg 要发送的信息
     */
    public void send2User(String userName, WebSocketResponse msg) {
        template.convertAndSendToUser(userName, Const.P2P_PUSH_PATH, msg);
    }

}
