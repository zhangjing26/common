package com.anjia.session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jing.Zhang
 * @date 2019/1/13
 */
public class SqlSessionFactoryFromXML {

    public SqlSessionFactory buildSessionFactory() throws IOException {
        String resource = "";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
}
