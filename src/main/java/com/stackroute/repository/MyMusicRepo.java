package com.stackroute.repository;

import com.stackroute.packet.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMusicRepo extends CrudRepository<Music,Integer>
{



    Music findBytrackId(int id);
}
