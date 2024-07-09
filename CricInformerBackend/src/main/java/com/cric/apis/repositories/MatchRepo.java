package com.cric.apis.repositories;

import com.cric.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    // match fetch karna chhata hun-->
    // provide karde --> teamName

    Optional<Match> findByTeamHeading(String teamHeading);
}
