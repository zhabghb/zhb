package cn.didadu.sdn.entity;

import lombok.Data;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;


@RelationshipEntity(type="Friend")
public class Seen {
    public Seen(Integer stars, User startNode, Movie endNode){
        this.stars = stars;
        this.startNode = startNode;
        this.endNode = endNode;
    }
  
    @GraphId
    private Long id;
    @Property
    private Integer stars;
    @StartNode
    private User startNode;
    @EndNode
    private Movie endNode;
}
