package cn.hyzs.TextSearchIntoHBase.dao;

import cn.hyzs.TextSearchIntoHBase.db.entity.JudicialDocumentInfo;
import cn.hyzs.TextSearchIntoHBase.db.mapper.JudicialInfoMapper;
import com.baomidou.mybatisplus.annotation.TableField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class JudicialDocumentDAOImpl implements JudicialDocumentDAO {
    @Autowired
    private  JudicialDocumentDAO judicialDocumentDAO;

    @Autowired
    private JudicialInfoMapper judicialInfoMapper;
    @Override
    public JudicialDocumentInfo queryJudicialDocumentInfoByDocId(String docId) {
        List list=new ArrayList<>();
//        for (JudicialDocumentInfo judicialDocumentInfo: judicialDocumentInfoMapper.selectById(docId)) {
//
//        }
        return null;


    }
    @Override
    public JudicialDocumentInfo queryJudicialDocumentInfoByField( Timestamp createTime) {
//        QueryWrapper<JudicialDocumentInfo> queryWrapper=new QueryWrapper();
//        queryWrapper.eq("create_time",createTime);
        JudicialDocumentInfo judicialDocumentInfo=
                       judicialInfoMapper.queryByCreateTime(createTime);
        return judicialDocumentInfo;
    }

    public static void main(String[] args)
    {
        try
        {
            Field field = JudicialDocumentInfo.class.getDeclaredField("createTime");
            Annotation annotation = field.getAnnotation(TableField.class);
            System.out.println(((TableField) annotation).value());
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public List<JudicialDocumentInfo> queryJudicialDocumentAll() {
        return null;
    }

    @Override
    public List<JudicialDocumentInfo> queryJudicialDocumentByCreateTime(Timestamp createTime) {
        return null;
    }
}
