package com.event.model.participation;

import com.event.model.entry.Entry;
import com.event.model.event.Event;

public class NormalParticipation implements Participation
{
    private final Long id;

    private final Entry entry;

    private final Event event;

    public NormalParticipation( Long id, Event event, Entry entry )
    {
        this.id = id;
        this.event = event;
        this.entry = entry;
    }

    @Override
    public String toString()
    {
        return "NormalParticipation{id=" + id + ", entry=" + entry + ", event=" + event + '}';
    }
}
