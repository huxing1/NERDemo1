package cn.hyzs.TextSearchIntoHBase.db.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;
import java.sql.Timestamp;

@TableName("tbl_user_info")
public class JudicialDocumentInfo {
    @TableId(value = "doc_id")
    private String docId;

    @TableField(value = "url")
    private String url;

    @TableField(value = "title")
    private String title;

    @TableField(value = "content")
    private String content;

    @TableField(value = "html_content")
    private String htmlContent;

    @TableField(value = "judgement_date")
    private Date judgementDate;

    @TableField(value = "pub_date")
    private Date pubDate;

    @TableField(value = "create_time")
    private Timestamp createTime;

    @TableField(value = "case_num")
    private String casenum;

    @TableField(value = "trial_procedures")
    private String trialProcedures;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
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

    public String getCasenum() {
        return casenum;
    }

    public void setCasenum(String casenum) {
        this.casenum = casenum;
    }

    public String getTrialProcedures() {
        return trialProcedures;
    }

    public void setTrialProcedures(String trialProcedures) {
        this.trialProcedures = trialProcedures;
    }
}
