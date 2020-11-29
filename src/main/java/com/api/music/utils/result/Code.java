package com.api.music.utils.result;

import java.util.HashMap;

//响应消息
public class Code {
    public static final String OK = "0";

    //数据
    public static final String DBERR = "2001";
    public static final String NODATA = "2002";
    public static final String DATAEXIST = "2003";
    public static final String DATAERR = "2004";
    public static final String METHERR = "2005";
    public static final String NOPARAMS = "2006";

    //用户
    public static final String SESSIONERR = "3001";
    public static final String LOGINERR = "3002";
    public static final String REGISTERR = "3003";
    public static final String PARAMERR = "3004";
    public static final String USERERR = "3005";
    public static final String STAUTSERR = "3006";
    public static final String ROLEERR = "3007";
    public static final String PWDERR = "3008";

    //验证
    public static final String MAILERR = "4001";
    public static final String SENDMAIL = "4002";

    //其它
    public static final String SERVERERR = "1001";
    public static final String UNKOWNERR = "1002";

    public static final HashMap<String,String> MSG = new HashMap<>();

    static {
        MSG.put(OK,"成功");

        //数据
        MSG.put(DBERR,"数据库查询错误");
        MSG.put(NODATA,"无数据");
        MSG.put(DATAEXIST,"数据已存在");
        MSG.put(DATAERR,"数据错误");
        MSG.put(METHERR,"方法错误");
        MSG.put(NOPARAMS,"无参数");

        //用户
        MSG.put(SESSIONERR,"未登录");
        MSG.put(LOGINERR,"登录失败");
        MSG.put(REGISTERR,"注册失败");
        MSG.put(PARAMERR,"参数错误");
        MSG.put(USERERR,"用户不存在");
        MSG.put(STAUTSERR,"用户未激活");
        MSG.put(ROLEERR,"身份错误");
        MSG.put(PWDERR,"密码错误");

        //验证
        MSG.put(MAILERR,"邮箱验证失败");
        MSG.put(SENDMAIL,"邮箱发送失败");

        //其它
        MSG.put(SERVERERR,"内部错误");
        MSG.put(UNKOWNERR,"未知错误");
    }
}
