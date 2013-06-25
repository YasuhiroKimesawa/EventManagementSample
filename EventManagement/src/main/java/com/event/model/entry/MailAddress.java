package com.event.model.entry;

class MailAddress
{
    private final String mailAddress;

    MailAddress( String mailAddress )
    {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString()
    {
        return "MailAddress{mailAddress='" + mailAddress + '\'' + '}';
    }
}
