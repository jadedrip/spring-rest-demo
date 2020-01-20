package org.caffy.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * 人的相关配置
 *
 * @author wangchen
 */
@Entity
@Table(name = "DATA_HUMAN_CONFIG", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"humanId", "type", "subType"})
})
public class DataHumanConfigModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer version;

    private Date createAt;

    private Timestamp updateAt;

    private String description;

    private Integer type;

    private Integer subType;

    private String config;

    private String humanId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc == null ? null : desc.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }
}