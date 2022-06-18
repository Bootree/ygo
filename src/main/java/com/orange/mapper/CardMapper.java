package com.orange.mapper;

import com.orange.pojo.Card;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CardMapper {

    @Select("select * from card")
    List<Card> selectAll();

    @Insert("insert into card values(#{id},#{cname},#{ename},#{jname},#{pic})")
    void add(Card card);

    @Select("select * from card where id=#{id}")
    Card selectById(int id);

    @Update("update card set cname=#{cname},ename=#{ename},jname=#{jname},pic=#{pic} where id=#{id}")
    void update(Card card);

    @Delete("delete from card where id=#{id}")
    void deleteById(int id);

    @Select("select * from card where cname like concat('%',#{sum},'%')")
    List<Card> selectBycname(String sum);

    @Select("insert into card1 values(#{id},#{cname},#{ename},#{jname},#{pic})")
    void add1(Card card);
}
