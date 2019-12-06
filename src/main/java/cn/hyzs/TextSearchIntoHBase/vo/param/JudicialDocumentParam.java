package cn.hyzs.TextSearchIntoHBase.vo.param;

import java.sql.Timestamp;
import java.util.Date;

public class JudicialDocumentParam {
    private String doc_id;
    private String url;
    private String title;
    private String content;
    private String htmlContent;
    private Date judgementDate;
    private Date pubDate;
    private Timestamp createTime;
    private String caseNum;
    private String trialProcedures;

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public Date getJudgementDate() {
        return judgementDate;
    }

    public void setJudgementDate(Date judgementDate) {
        this.judgementDate = judgementDate;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public String getTrialProcedures() {
        return trialProcedures;
    }

    public void setTrialProcedures(String trialProcedures) {
        this.trialProcedures = trialProcedures;
    }
}
