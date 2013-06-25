package com.event.model.entry;

public class NormalEntry implements Entry
{
    private final Name name;
    private final Profile profile;

    public NormalEntry( Name name, Profile profile )
    {
        this.name = name;
        this.profile = profile;
    }

    @Override
    public String toString()
    {
        return "NormalEntry{name=" + name + ", profile=" + profile + '}';
    }
}
