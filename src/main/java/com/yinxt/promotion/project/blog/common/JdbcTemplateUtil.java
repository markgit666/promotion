package com.yinxt.promotion.project.blog.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Service
public class JdbcTemplateUtil {

    @Autowired
    DataSource dataSource;

    private static JdbcTemplate jdbcTemplate;

    @PostConstruct
    void init() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public static JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}