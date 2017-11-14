package cn.didadu.sdn.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.didadu.sdn.entity.User;

@Repository
public interface UserRepository extends GraphRepository<User>{
    @Query("MATCH (user:user {name:{name}}) RETURN user")
    User getUserByName(@Param("name") String name);
}


