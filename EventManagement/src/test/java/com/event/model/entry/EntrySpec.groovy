package com.event.model.entry

import spock.lang.Specification

class EntrySpec extends Specification
{
    def 初期化()
    {
        when:
            def name = new Name( "田中", "達也")
            def mailAddress = new MailAddress( "tatuya@urawa-reds.com" )
            def twitter = new TwitterAccount( "@tatuya" )
            def profile = new Profile( mailAddress, twitter )

            def applicant = new NormalEntry( name, profile )

        then:
            applicant.toString()
    }
}
