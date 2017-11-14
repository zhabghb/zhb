package cn.didadu.sdn.entity;

import java.util.List;

import lombok.Data;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity
public class Movie {
   
	public Movie(String name){
        this.name = name;
    }
    @GraphId
    private Long nodeId;
    @Property(name="name")
    private String name;
    @Relationship(type="both")
    //private List<Seen> hasSeenMovies;
	private User user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
