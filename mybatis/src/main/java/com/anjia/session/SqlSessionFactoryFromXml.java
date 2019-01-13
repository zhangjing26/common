package com.anjia.session;

import com.anjia.dao.UserMapper;
import com.anjia.dao.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jing.Zhang
 * @date 2019/1/13
 */
public class SqlSessionFactoryFromXml {


    public static SqlSessionFactory buildSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = buildSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectByPrimaryKey(1);
            System.out.println(user);
        } finally {
            session.close();
        }
    }
}
