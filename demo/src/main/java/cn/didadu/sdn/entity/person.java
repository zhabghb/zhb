package cn.didadu.sdn.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class person {
    @GraphId
	private Long Id;
    @Property(name="name")
    private String name;
    @Property(name="age")
    private String age;
    @Relationship(type="Movie")
    private Movie movie;
    
	
	public person(String name, String age) {
		super();
	
		this.name = name;
		this.age = age;
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
    
}
