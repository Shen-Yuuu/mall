package cn.sdu.mall.util;

import lombok.Data;

@Data
public class ServerResult<T> {
    //状态码
    private Integer code;
    //提示信息
    private String message;
    //数据
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ServerResult<T> ok(T data){
        ServerResult<T> result = new ServerResult<>();
        result.setCode(200);
        result.setMessage("OK");
        result.setData(data);
        return result;
    }

    public static  ServerResult<Void> ok(){
        return ok(null);
    }

    public static ServerResult<Void> error(Integer code, String message){
        ServerResult<Void> result = new ServerResult<>();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
