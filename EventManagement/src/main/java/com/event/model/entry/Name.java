package com.event.model.entry;

class Name
{
    private String first;
    private String last;

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
