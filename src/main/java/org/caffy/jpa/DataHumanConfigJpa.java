package org.caffy.jpa;

import org.caffy.model.DataHumanConfigModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "humanConfig", path = "humanConfig")
public interface DataHumanConfigJpa extends JpaRepository<DataHumanConfigModel, Long> {
    List<DataHumanConfigModel> findByHumanId(String humanId);

    @Modifying
    @Transactional
    void deleteByHumanId(String humanId);

    DataHumanConfigModel findByHumanIdAndTypeAndSubType(String humanId, Integer type, Integer subType);
}
