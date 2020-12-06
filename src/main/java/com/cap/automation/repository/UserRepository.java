package com.cap.automation.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cap.automation.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{
	 //public User findTypeInterface(String type);
	//int countByTypeInterface(String type);

	int countByTypeInterface(String typeInterface);

}
