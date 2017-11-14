package cn.didadu.sdn.entity;

import java.util.List;

import lombok.Data;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity
public class User {
    public User(){}
    
    public User(String name){
        this.name = name;
    }
    @GraphId
    private Long nodeId;
    @Property(name="name")
    private String name;
    //关系直接定义在节点中
    @Relationship(type = "IS_FRIEND_OF", direction=Relationship.OUTGOING)
    private List<User> friends;
    //使用外部定义的关系
    @Relationship(type="both")
    //private List<Seen> hasSeenMovies;
	private Movie movie;
    public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}