package com.event.datasource.entry;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class EntryDataSource
{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    EntryMapper mapper;

    @PostConstruct
    private void setupMapper()
    {
        mapper = sqlSessionTemplate.getMapper( EntryMapper.class );
    }
}
