package UserServiceTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.didadu.sdn.entity.Movie;
import cn.didadu.sdn.entity.PersonRefMov;
import cn.didadu.sdn.entity.Seen;
import cn.didadu.sdn.entity.User;
import cn.didadu.sdn.entity.person;
import cn.didadu.sdn.entity.personToMovie;
import cn.didadu.sdn.entity.personToUser;
import cn.didadu.sdn.repository.MovieRepository;
import cn.didadu.sdn.repository.PersonRef;
import cn.didadu.sdn.repository.PersonRepositroy;
import cn.didadu.sdn.repository.PersonToMovie;
import cn.didadu.sdn.repository.SeenRepository;
import cn.didadu.sdn.repository.UserRepository;
import cn.didadu.sdn.repository.personToUserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:/spring/applicationContext.xml" })
public class UserServiceTest {
  /*  @Autowired
    private UserService userService;*/
	@Autowired(required=true)
	private UserRepository userRepository;
	@Autowired
	private MovieRepository movieRepository;
	@Autowired
	private SeenRepository seenRepository;
	@Autowired
	private PersonRepositroy personRepositroy;
	@Autowired
	private PersonRef personRef;
	@Autowired
	private personToUserRepository personToUserRepository;
	@Autowired
	private PersonToMovie personToMovie;
    /**
     * 因为是通过http连接到Neo4j数据库的，所以要预先启动Neo4j：neo4j console
     */
    @Test
    public void testInitData(){
        //userService.initData();
    	//这是用户实体
		User user = new User("xiaowb");
		userRepository.save(user);
		//userRepository.deleteAll();
		//userRepository.delete(user);
		//这是看电影实体
    	Movie mov = new Movie("Movie");
    	movieRepository.save(mov);
    	//movieRepository.deleteAll();	
    	//这是人类实体
    	person person = new person("xiaojr","27");
    	personRepositroy.save(person);
    	//这是用户实体和看电影实体
    	Seen hasSeen1 = new Seen(5, user, mov);
    	seenRepository.save(hasSeen1);
    	//这是电影实体和用户实体
       PersonRefMov mov2 = new PersonRefMov(2, mov, user);
        personRef.save(mov2);
        //这是person和mov实体
        personToMovie perMovie = new personToMovie(2, person, mov);
        personToMovie.save(perMovie);
        //这是person和user实体关系类
        personToUser perUser = new personToUser(3, person, user);
        personToUserRepository.save(perUser);
    	//seenRepository.save(hasSeen1);
    	
    	//seenRepository.deleteAll();;
    }
    @Test
    public void testGetUserByName(){
        User user = userRepository.getUserByName("xiaowb");
        System.out.println(user);
    }
}
