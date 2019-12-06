package cn.hyzs.TextSearchIntoHBase.service;

import cn.hyzs.TextSearchIntoHBase.dao.JudicialDocumentDAO;
import cn.hyzs.TextSearchIntoHBase.db.entity.JudicialDocumentInfo;
import cn.hyzs.TextSearchIntoHBase.utils.DateUtils;
import cn.hyzs.TextSearchIntoHBase.vo.JudicialDocumentVO;
import com.baomidou.mybatisplus.annotation.TableField;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class JudicialDocumentServiceImpl implements JudicialDocumentService {
    @Autowired
    private JudicialDocumentDAO judicialDocumentDAO;



    @Override
    public List<JudicialDocumentVO> queryByDocId(String docId) {
        return null;
    }

    @Override
    public List<JudicialDocumentVO> queryJudicialDocumentInfo() {
        return null;
    }

    @Override
    public  JudicialDocumentVO queryJudicialDocumentInfoByCreateTime(Timestamp createTime) {
            JudicialDocumentInfo judicialDocumentInfo=
                    judicialDocumentDAO.queryJudicialDocumentInfoByField(createTime);
            JudicialDocumentVO judicialDocumentVO=this.prepareVO(judicialDocumentInfo);
            return judicialDocumentVO;
        }

        private JudicialDocumentVO prepareVO(JudicialDocumentInfo judicialDocumentInfo){
            JudicialDocumentVO judicialDocumentVO=null;
        judicialDocumentVO.setCaseNum(judicialDocumentInfo.getCasenum());
        judicialDocumentVO.setContent(judicialDocumentInfo.getContent());
        judicialDocumentVO.setCreateTime(judicialDocumentInfo.getCreateTime());
        judicialDocumentVO.setDocId(judicialDocumentInfo.getDocId());
        judicialDocumentVO.setHtmlContent(judicialDocumentInfo.getHtmlContent());
        judicialDocumentVO.setJudgementDate(judicialDocumentInfo.getJudgementDate());
        judicialDocumentVO.setPubDate(judicialDocumentInfo.getPubDate());
        judicialDocumentVO.setTitle(judicialDocumentInfo.getTitle());
        judicialDocumentVO.setTrialProcedures(judicialDocumentInfo.getTrialProcedures());
        judicialDocumentVO.setUrl(judicialDocumentInfo.getUrl());
        return judicialDocumentVO;
    }




}
