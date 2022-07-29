package jp.co.internous.ecsite.model.dao;

import jp.co.internous.ecsite.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{
	
	List<User> findByUserNameAndPassword(String userName, String password);

}
