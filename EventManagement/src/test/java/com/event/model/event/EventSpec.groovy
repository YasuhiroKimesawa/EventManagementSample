package com.event.model.event

import spock.lang.Specification

class EventSpec extends Specification
{
    def 初期化()
    {
        given :
            def event = new NormalEvent( (long)1, "読書会" );
    }
}
