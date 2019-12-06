package cn.hyzs.TextSearchIntoHBase.api;

import cn.hyzs.TextSearchIntoHBase.foundation.dto.ResponseResultDTO;
import cn.hyzs.TextSearchIntoHBase.vo.JudicialDocumentVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JudicialDocumentController {

    @GetMapping("/api/docContent/query")
    public ResponseResultDTO<JudicialDocumentVO> query(
            @RequestParam(name = "pageno", required = false) Integer pageNo) {
        return null;
    }

}
