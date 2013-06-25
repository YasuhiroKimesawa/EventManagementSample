package com.event.model.participation

import com.event.model.event.Event
import com.event.model.entry.Entry

import spock.lang.Specification

class ParticipationListSpec extends Specification
{
    def 初期化()
    {
        when:
        def event = Mock( Event )
        def applicant = Mock( Entry )

        def participation = new NormalParticipation( (long)1, event, applicant )
        def participationList = new ArrayList<Participation>()
        participationList.add( participation )
        def entries = new ParticipationList( participationList )

        then:
        entries.toString()
    }
}
