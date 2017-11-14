package cn.didadu.sdn.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import cn.didadu.sdn.entity.PersonRefMov;
import cn.didadu.sdn.entity.person;
@Repository
public interface PersonRef extends GraphRepository<PersonRefMov>{

}
