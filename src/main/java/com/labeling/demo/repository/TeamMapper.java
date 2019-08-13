package com.labeling.demo.repository;

import com.labeling.demo.entity.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeamMapper {
    int deleteByPrimaryKey(Integer teamId);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer teamId);

    Team findByName(String teamName);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    @Select("select * from tb_team")
    List<Team> findAll();
}