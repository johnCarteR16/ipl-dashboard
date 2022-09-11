package com.java.ipldashboard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.ipldashboard.models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{
    
    Team findByTeamName(String teamName);
    
}
