package cn.hyzs.TextSearchIntoHBase.utils;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static final String DF_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 将日期转化成时间戳
     * @param date
     * @return
     */
    public static Timestamp dateSecon2Timestamp(Date date) {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        Timestamp ts = Timestamp.valueOf(dateStr);
        return ts;
    }

    /**
     * 将日期字符串转成日期
     * @param strDate
     * @return
     */
    public static Date parseDate(String strDate) {
        DateFormat dateFormat = new SimpleDateFormat(DF_YYYY_MM_DD_HH_MM_SS);
        Date returnDate = null;
        try {
            returnDate = dateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return returnDate;

    }
    /**
     * 将日期字符串转换为Date对象
     * @param date 日期字符串，必须为"yyyy-MM-dd HH:mm:ss"
     * @param format 格式化字符串
     * @return 日期字符串的Date对象表达形式
     * */
    public static Date parse2Date(String date, String format) {

        Date dt = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        try {
            dt = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dt;
    }

    public static void main(String[] args) {
        Date date= parse2Date("2019-10-08 09:29:09","yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp=dateSecon2Timestamp(date);
        System.out.println(timestamp);
    }
}
