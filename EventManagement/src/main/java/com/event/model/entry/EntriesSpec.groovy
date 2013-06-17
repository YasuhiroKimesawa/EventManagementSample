package com.event.model.entry

import com.event.model.entry.Entry
import com.event.model.entry.MailAddress
import com.event.model.entry.Name
import com.event.model.entry.NormalEntry
import com.event.model.entry.Profile
import com.event.model.entry.TwitterAccount
import com.event.model.event.Event
import com.event.model.entry.Entries
import spock.lang.Specification

class EntriesSpec extends Specification
{
    def 初期化()
    {
        given:
        def event = Mock( Event )
        def name = new Name( "田中", "達也" )
        def mail = new MailAddress( "tatuya@urawa-reds.com" )
        def twitter = new TwitterAccount( '@tatuya' )
        def profile = new Profile( mail, twitter )
        def entry = new NormalEntry( (long)1, event, name, profile )
        def entryList = new ArrayList<Entry>()
        entryList.add( entry );
        def entries = new Entries( entryList )
    }

}
