package cn.hyzs.TextSearchIntoHBase.api;

import cn.hyzs.TextSearchIntoHBase.foundation.dto.ResponseResultDTO;
import cn.hyzs.TextSearchIntoHBase.foundation.exception.BdprmException;
import cn.hyzs.TextSearchIntoHBase.service.JudicialDocumentService;
import cn.hyzs.TextSearchIntoHBase.utils.BErrorCode;
import cn.hyzs.TextSearchIntoHBase.vo.JudicialDocumentVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class JudicialDocumentController {
    private static Logger LOGGER = LoggerFactory.getLogger(JudicialDocumentController.class);

    @Autowired
    private JudicialDocumentService judicialDocumentService;

    @GetMapping("/api/docContent/query")
    public ResponseResultDTO<JudicialDocumentVO> queryByCreateTime(
            @RequestParam(name = "createTime", required = false) Timestamp createTime) {


        LOGGER.info("#####call query user.");
        try {
            JudicialDocumentVO judicialDocumentVO =
                    judicialDocumentService.queryJudicialDocumentInfoByCreateTime(createTime);
            return ResponseResultDTO.success(judicialDocumentVO);
        }catch (BdprmException ex){
            return ResponseResultDTO.failure(ex.getErrCode(),ex.getMsg());
        }
    }

}
