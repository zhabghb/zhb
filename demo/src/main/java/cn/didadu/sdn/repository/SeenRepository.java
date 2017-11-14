package cn.didadu.sdn.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import cn.didadu.sdn.entity.Seen;

@Repository
public interface SeenRepository extends GraphRepository<Seen> {
}
