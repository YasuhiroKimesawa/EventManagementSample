package com.event.model.entry;

import java.util.ArrayList;
import java.util.List;

public class Entries
{
    private List<Entry> entries = new ArrayList<Entry>();

    public Entries( List<Entry> entries )
    {
        this.entries = entries;
    }

    @Override
    public String toString()
    {
        return "Entries{entries=" + entries + '}';
    }
}
