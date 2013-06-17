package com.event.model.entry;

class Profile
{
    private MailAddress mailAddress;
    private TwitterAccount twitterAccount;

    Profile( MailAddress mailAddress, TwitterAccount twitterAccount )
    {
        this.mailAddress = mailAddress;
        this.twitterAccount = twitterAccount;
    }

    @Override
    public String toString()
    {
        return "Profile{mailAddress=" + mailAddress + ", twitterAccount=" + twitterAccount + '}';
    }
}
