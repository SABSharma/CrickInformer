package com.cric.apis.services;

import com.cric.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    // get all matches

    List<Match> getAllMatches();

    // get live ,matches
    List<Match> getLiveMatches();

    //get ipl point table

    List<Map<String , String>> getIplPointTable();

    List<List<String>> getIPl2024PointTable();
}
