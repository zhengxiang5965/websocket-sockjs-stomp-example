package world.zhx.example.websocket.common;

public class Const {
    //webSocket相关配置
    //链接地址
    public static final String WEBSOCKET_PATH_PERFIX = "/ws-push";
    public static final String WEBSOCKET_PATH = "/endpoint";
    //消息代理路径
    public static final String WEBSOCKET_BROADCAST_PATH = "/topic";
    //服务端生产地址,客户端订阅此地址以接收服务端生产的消息
    public static final String PRODUCER_PATH = "/topic/getResponse";
    //点对点消息推送地址前缀
    public static final String P2P_PUSH_BASE_PATH = "/user";
    //点对点消息推送地址后缀,最后的地址为/user/用户识别码/msg
    public static final String P2P_PUSH_PATH = "/msg";


    //前端发送给服务端请求地址
    public static final String FORE_TO_SERVER_PATH = "/welcome";

    public static final String EXAMPLE_P2P_USER = "example";
}
