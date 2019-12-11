package cn.hyzs.TextSearchIntoHBase.service;

import cn.hyzs.TextSearchIntoHBase.vo.JudicialDocumentVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;
import java.util.List;


public interface JudicialDocumentService {

    List<JudicialDocumentVO> queryByDocId(String docId);

    List<JudicialDocumentVO> queryJudicialDocumentInfo();

    JudicialDocumentVO queryJudicialDocumentInfoByCreateTime(@Param("createTime") Timestamp createTime);

}
