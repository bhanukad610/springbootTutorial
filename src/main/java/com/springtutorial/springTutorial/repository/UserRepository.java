package com.springtutorial.springTutorial.repository;

import com.springtutorial.springTutorial.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository < User, String > {

}
