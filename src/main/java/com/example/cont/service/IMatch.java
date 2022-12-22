package com.example.cont.service;

import com.example.cont.doa.Match;
import com.example.cont.doa.Ticket;
import com.example.cont.repos.MatchRepo;

import java.util.Collection;
import java.util.List;

public interface IMatch {
    public String addmatch(Match matc);
    public Match getMatch(String ref);
    public Collection<Ticket> getMatchTickets(String ref);

}
