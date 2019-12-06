package cn.hyzs.TextSearchIntoHBase.utils;

import com.google.common.collect.Maps;

import java.util.Map;

public class BErrorDesc {

    public static String SUCCESS_MSG="operation success";
    public static final Map<Integer,String> ERROR_CODE_MSG_MAPPING= Maps.newHashMap();


    static {
        ERROR_CODE_MSG_MAPPING.put(BErrorCode.SUCCESS_CODE,"operation success");
        ERROR_CODE_MSG_MAPPING.put(BErrorCode.ERR_CODE_DB_SQL_EXEC_FAILURE,"database access error");
        ERROR_CODE_MSG_MAPPING.put(BErrorCode.ERR_CODE_NO_LOGIN_ERROR,"user no login");
    }

}
