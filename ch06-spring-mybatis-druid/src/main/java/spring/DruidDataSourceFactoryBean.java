package spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.FactoryBean;

import javax.sql.DataSource;


/**
 * 此类将db.properties代替
 * 用factoryBean接口
 */
public class DruidDataSourceFactoryBean implements FactoryBean<DataSource> {
    @Override
    public DataSource getObject() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setName("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");

        return dataSource;
    }
//获取对象类型
    @Override
    public Class<?> getObjectType() {
        return DataSource.class;
    }
//表示单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
