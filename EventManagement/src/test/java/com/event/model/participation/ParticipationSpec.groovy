package com.event.model.participation

import com.event.model.event.Event
import com.event.model.entry.Entry

import spock.lang.Specification

class ParticipationSpec extends Specification
{
    def 初期化()
    {
        given:
            def event = Mock( Event )
            def entry = Mock( Entry )

            def participation = new NormalParticipation( (long)1, event, entry )

        participation.toString()
    }
}
