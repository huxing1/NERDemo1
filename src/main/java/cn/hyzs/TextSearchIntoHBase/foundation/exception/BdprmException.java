package cn.hyzs.TextSearchIntoHBase.foundation.exception;

import cn.hyzs.TextSearchIntoHBase.utils.BErrorCode;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @program: NERDemo1
 * @description: 异常
 * @author: hux
 * @create: 2019-12-10 14:42
 **/
public class BdprmException extends RuntimeException{
    private static final long serialVersionUID = 2462799309496702446L;
    private int errCode;
    private String msg;


    public BdprmException(String msg)
    {
        this(BErrorCode.ERR_CODE_SYSTEM_INTERNAL_ERROR, msg);
    }

    public BdprmException(int code, String msg)
    {
        super(msg);
        this.errCode = code;
        this.msg = msg;
    }

    public int getErrCode()
    {
        return errCode;
    }

    public void setErrCode(int errCode)
    {
        this.errCode = errCode;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
                .append("errCode", errCode)
                .append("msg", msg)
                .toString();
    }
}
