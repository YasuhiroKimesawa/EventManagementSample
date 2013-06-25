package com.event.model.participation;

import java.util.ArrayList;
import java.util.List;

public class ParticipationList
{
    private List<Participation> list = new ArrayList<Participation>();

    public ParticipationList( List<Participation> list )
    {
        this.list = list;
    }

    @Override
    public String toString()
    {
        return "ParticipationList{list=" + list + '}';
    }
}
