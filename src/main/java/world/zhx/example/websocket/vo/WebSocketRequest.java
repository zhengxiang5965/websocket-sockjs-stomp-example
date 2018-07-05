package world.zhx.example.websocket.vo;


public class WebSocketRequest {

    private String name;


    public WebSocketRequest() {
    }

    public WebSocketRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
