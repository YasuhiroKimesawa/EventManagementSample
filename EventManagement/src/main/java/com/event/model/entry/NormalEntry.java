package com.event.model.entry;

import com.event.model.event.Event;

public class NormalEntry implements Entry
{
    private Long id;
    private Name name;
    private Event event;
    private Profile profile;

    public NormalEntry( Long id, Event event, Name name, Profile profile )
    {
        this.id = id;
        this.event = event;
        this.name = name;
        this.profile = profile;
    }

    @Override
    public String toString()
    {
        return "NormalEntry{" + "id=" + id + ", name=" + name + ", event=" + event + ", profile=" + profile + '}';
    }
}
