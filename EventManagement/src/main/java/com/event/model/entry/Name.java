package com.event.model.entry;

class Name
{
    private final String first;
    private final String last;

    Name( String first, String last )
    {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString()
    {
        return "Name{first='" + first + '\'' + ", last='" + last + '\'' + '}';
    }
}
