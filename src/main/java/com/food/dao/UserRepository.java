package com.food.dao;

import com.food.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

//  @Query("select * from User where u.email = :email")
//  public User getUserByUserName(@Param("email") String email);

  User findByUserName(String username);

}
