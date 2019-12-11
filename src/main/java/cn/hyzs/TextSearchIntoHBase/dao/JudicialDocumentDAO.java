package cn.hyzs.TextSearchIntoHBase.dao;

import cn.hyzs.TextSearchIntoHBase.db.entity.JudicialDocumentInfo;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;
import java.util.List;

public interface JudicialDocumentDAO {

    JudicialDocumentInfo queryJudicialDocumentInfoByDocId(String docId);

    JudicialDocumentInfo queryJudicialDocumentInfoByField(Timestamp createTime);

    List<JudicialDocumentInfo> queryJudicialDocumentAll();

    List<JudicialDocumentInfo> queryJudicialDocumentByCreateTime(Timestamp createTime);
}
