package org.caffy;


import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

/**
 * 由于我们的 MySql 不支持小写的表名，因此用在配置里加入这个类，让表名用大写
 * spring.jpa.hibernate.naming.physical-strategy: org.caffy.MySQLUpperCaseTable
 */
public class MySQLUpperCaseTable extends SpringPhysicalNamingStrategy {
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        return name;
    }
}
