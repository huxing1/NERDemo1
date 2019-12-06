package cn.hyzs.TextSearchIntoHBase;

import cn.huacloud.platform.sdk.client.AIOpenClient;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Map;


public class TestNerAggregationTest {
    @org.junit.Test
    public void testNerAggregation() {

        //参入需要识别的文档
        String text = "广东省广州市白云区人民法院刑事判决书" +
                "(2019)粤0000刑初00号公诉机关广州市白云区人民检察院." +
                "被告人黄某某。男,1995年12月13日出生,汉族,文化程度初中,户籍地" +
                "为广东省XX县XX镇XX管区巷32号。因本案于2018年9月19日被羁押并于同日被刑事拘留," +
                "同年9月26日被广州市公安局取保候审。2019年1月9日被广" +
                "州市白云区人民检察院取保侯审,同年1月22日被本院取保候审。";

        //业务ID，可在开发者平台中NER聚合接口的参数查询页中查找
        String businessId = "xsyspj";

        // 创建客户端，这里可以变成单例。供其他业务调用平台接口
        AIOpenClient aiOpenClient =
                new AIOpenClient("http://ai.hua-cloud.com.cn:8072/api", "test", "123456");

        //调用NER聚合接口
        Map<String, Object> result = aiOpenClient.nerAggregation(businessId, text);

        //使用fastjson将结果转换成String打印到控制台
        System.out.println(JSONObject.toJSONString(result));
    }
}
