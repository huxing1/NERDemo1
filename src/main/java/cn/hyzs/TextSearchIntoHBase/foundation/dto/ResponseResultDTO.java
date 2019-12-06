package cn.hyzs.TextSearchIntoHBase.foundation.dto;

import cn.hyzs.TextSearchIntoHBase.utils.BErrorCode;
import cn.hyzs.TextSearchIntoHBase.utils.BErrorDesc;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class ResponseResultDTO<T> implements Serializable {
    private static final long serialVersionUID = 8387862644010078402L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private Boolean success;
    private int resultCode;
    private String resultMsg;

    /**
     * @Description: 创建成功的response结果
     * @Param: [data]
     * @return: cn.hyzs.TextSearchIntoHBase.foundation.dto.ResponseResultDTO<T>
     * @Author: hux
     * @Date: 2019/12/6
     */
    public static <T> ResponseResultDTO<T> success(T data) {

        return new ResponseResultDTO<>(data, true, BErrorCode.SUCCESS_CODE, BErrorDesc.SUCCESS_MSG);
    }

    /**
    * @Description: 创建失败的response结果
    * @Param: [resultCode, resultMsg]
    * @return: cn.hyzs.TextSearchIntoHBase.foundation.dto.ResponseResultDTO<T>
    * @Author: hux
    * @Date: 2019/12/6
    */
    public static <T> ResponseResultDTO<T> failure(int resultCode,String resultMsg){
        return new ResponseResultDTO<>(null,false,resultCode,resultMsg);
    }

    private ResponseResultDTO(T data, Boolean isSucc, int resultCode, String resultMsg) {
        this.data = data;
        this.success = isSucc;
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String toString(){
        return new ToStringBuilder(this)
                .append("resultCode",resultCode)
                .append("resultMsg",resultMsg)
                .append("data",data)
                .append("success",success).toString();
    }
}
