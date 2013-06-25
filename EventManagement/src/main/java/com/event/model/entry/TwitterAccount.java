package com.event.model.entry;

class TwitterAccount
{
    private final String account;

    TwitterAccount( String account )
    {
        this.account = account;
    }

    @Override
    public String toString()
    {
        return "TwitterAccount{account='" + account + '\'' + '}';
    }
}
