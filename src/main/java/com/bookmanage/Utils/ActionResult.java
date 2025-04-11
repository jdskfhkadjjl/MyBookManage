package com.bookmanage.Utils;

import lombok.Data;

import java.io.Serializable;

@Data//这里需要提供get，set方法，不然序列化会失败，触发406错误
public class ActionResult{
    private Integer code;
    private String msg;
    private Object data;

    public ActionResult(Integer code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
    public static ActionResult success(){
        return new ActionResult(200,"操作成功",null);
    }
//    public ActionResult
}
