package world.zhx.example.websocket.vo;

public class WebSocketResponse {


    private String functionCode;

    private String functionMessage;

    public WebSocketResponse() {
    }

    public WebSocketResponse(String functionCode, String functionMessage) {
        this.functionCode = functionCode;
        this.functionMessage = functionMessage;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionMessage() {
        return functionMessage;
    }

    public void setFunctionMessage(String functionMessage) {
        this.functionMessage = functionMessage;
    }
}
