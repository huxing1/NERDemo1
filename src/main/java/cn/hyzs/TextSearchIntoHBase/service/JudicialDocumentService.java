package cn.hyzs.TextSearchIntoHBase.service;

import cn.hyzs.TextSearchIntoHBase.utils.DateUtils;
import cn.hyzs.TextSearchIntoHBase.vo.JudicialDocumentVO;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface JudicialDocumentService {

    List<JudicialDocumentVO> queryByDocId(String docId);

    List<JudicialDocumentVO> queryJudicialDocumentInfo();


    JudicialDocumentVO queryJudicialDocumentInfoByCreateTime(Timestamp createTime);

}
