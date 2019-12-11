package cn.hyzs.TextSearchIntoHBase.db.mapper;

import cn.hyzs.TextSearchIntoHBase.db.entity.JudicialDocumentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

public interface JudicialInfoMapper extends BaseMapper<JudicialDocumentInfo> {
    /***
     * @Description: 方法名queryByCreateTime要和JudicialDocumentInfoMapper.xml的id一致
     * @Param: [createTime]
     * @return: cn.hyzs.TextSearchIntoHBase.db.entity.JudicialDocumentInfo
     * @Author: hux
     * @Date: 2019/12/10
     */
    JudicialDocumentInfo queryByCreateTime(@Param("createTime") Timestamp createTime);
}
