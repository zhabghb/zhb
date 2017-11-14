package cn.didadu.sdn.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import cn.didadu.sdn.entity.Seen;
import cn.didadu.sdn.entity.personToUser;
@Repository
public interface personToUserRepository extends GraphRepository<personToUser> {

}
