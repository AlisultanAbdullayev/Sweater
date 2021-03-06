package com.alijaver.sweater.repos;

import com.alijaver.sweater.domains.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message,Integer> {

    List<Message> findByTag(String tag);
}
