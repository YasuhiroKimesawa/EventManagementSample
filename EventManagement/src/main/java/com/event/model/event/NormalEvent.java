package com.event.model.event;

public class NormalEvent implements  Event
{
    private Long id;
    private String name;

    public NormalEvent( Long id, String name )
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "NormalEvent{id=" + id + ", name='" + name + '\'' + '}';
    }
}
