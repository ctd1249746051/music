package com.api.music.utils.result;

//用于封装后端返回前端数据对象
public class ResultInfo {
    private String code;   //返回的状态码
    private String msg; //返回的消息
    private Object data;    //返回的数据对象

    public ResultInfo() {
        this.code = Code.OK;
        this.msg = Code.MSG.get(this.code);
    }

    public ResultInfo(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
        setMsg(Code.MSG.get(this.code));
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
