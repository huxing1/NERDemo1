package cn.hyzs.TextSearchIntoHBase;

import cn.huacloud.platform.sdk.client.AIOpenClient;
import cn.huacloud.platform.sdk.param.NerInferModelParam;
import cn.huacloud.platform.sdk.result.NerInferResult;
import cn.huacloud.platform.sdk.result.NerResultItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class AiOpenClientTest {

    @Test
    public void nerInferByModelCodes() {
        // 创建客户端
        AIOpenClient aiOpenClient = new AIOpenClient("http://ai.hua-cloud.com.cn:8072/api", "test", "123456");

        // 实体识别接口调用测试
        NerInferModelParam param = new NerInferModelParam();
        // 设置待识别文本
        String text = "贵州省临鑫市平安县人民检察院起诉书xx公诉刑诉〔2018〕x号被告人徐某松，曾用名徐某，男，1996年9月26日出生，公民身份证号码522225xxxxxxxxxxxx，汉族，初中文化，无业，户籍所在地贵州省临鑫市平安县，住平安县西凉县三星村三星组。因涉嫌故意伤害罪于2018年2月20日被平安县公安局决定取保候审，于2018年6月1日被本院决定取保候审。被害人黄某，曾用名无，男，1993年4月21日出生，公民身份证号码522225xxxxxxxxxxxx，汉族，高中文化，务工，户籍所在地贵州省临鑫市平安县，住平安县西凉县第二十四区街道办事处105号7单元左手拇指离断伤损伤程度属重伤二级；左肘部皮肤裂伤、尺侧腕屈肌不完全断裂及左尺骨骨折损伤程度属轻微伤。本案由平安县公安局侦查终结，以被告人徐某松涉嫌故意伤害罪于2018年5月11日移送审查起诉。本院受理后，于2018年5月12日告知被告人依法享有的诉讼权利，于2018年5月12日告知被害人依法享有的诉讼权利；已依法讯问被告人，听取被害人的意见，审查了全部案件材料。经依法审查查明：2018年2月18日22时许，被告人徐某松与其妻子杨某琴及朋友徐某琴、柳某某、白某、卢某六人一起在平安县西凉县新区下街“幸福”奶茶店内一桌喝奶茶，被害人黄某与周某、杨某、简某四人在该奶茶店内另一桌喝奶茶。因黄某与杨某琴谈过恋爱，当徐某松听见黄某等人在讨论杨某琴时，并质问黄某导致二人发生争吵。随即徐某松到冯某胜家中拿了一把单刃刀藏在身上后返回奶茶店，徐某松持刀将黄某的左手拇指砍断，又继续在朝黄某身上砍了几刀，随后离开现场。经贵州省平安县人民医院法医司法鉴定中心鉴定，被害人黄某左手拇指离断伤损伤程度属重伤二级；左肘部皮肤裂伤、尺侧腕屈肌不完全断裂及左尺骨骨折损伤程度属轻微伤。2018年2月19日，被告人徐某松主动到公安机关投案后如实供述其上述犯罪事实。7.视听资料、电子数据：辨认现场视频、提取笔录视频、同步讯问视频光盘。本院认为，被告人徐某松故意伤害他人身体致其重伤，其行为已触犯了《中华人民共和国刑法》第二百三十四条第二款规定，犯罪事实清楚，证据确实充分，应当以故意伤害罪追究其刑事责任。根据《中华人民共和国刑事诉讼法》第一百七十二条的规定，提起公诉，请依法判处。此致贵州省平安县人民法院检察员：何xx2018年6月4日附：1.被告人徐某松现取保候审在家，联系电话15xxxxxxxxx。2.案卷材料和证据2册，光盘4张、刑事附带民事诉讼状1份。";
        param.setText(text);

        // 设置模型码值参数
        List<String> modelCodes = new ArrayList<>();
        // 出生日期
        modelCodes.add("BD");
        // 民族
        modelCodes.add("PN");
        // 学历
        modelCodes.add("E");
        param.setModelCodes(modelCodes);

        // 执行调用
        List<NerInferResult> result = aiOpenClient.getNerInferByModelCodes(param);
        for (NerInferResult nerInferResult : result
        ) {

            String tagName = nerInferResult.getTagName();
            System.out.println(tagName);
            for (NerResultItem nerResultItem : nerInferResult.getValues()
            ) {
                System.out.println(nerResultItem.getText() + "," + nerResultItem.getIndex());
            }
        }
    }

}
