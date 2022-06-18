package com.orange.service;

import com.orange.mapper.CardMapper;
import com.orange.pojo.Card;
import com.orange.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CardService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();



    public List<Card> selectAll(){
        //调用CardMapper.selectAll()


        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        List<Card> cards = mapper.selectAll();

        sqlSession.close();

        return cards;
    }

    public void add(Card card){
        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        mapper.add(card);

        sqlSession.commit();

        sqlSession.close();
    }

    public Card selectById(int id){
        //调用CardMapper.selectAll()


        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        Card card = mapper.selectById(id);

        sqlSession.close();

        return card;
    }

    public void update(Card card){
        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        mapper.update(card);

        sqlSession.commit();

        sqlSession.close();
    }

    public void deleteById(int id){
       //删除

        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        mapper.deleteById(id);

        sqlSession.commit();

        sqlSession.close();

    }

    public List<Card> selectBycname(String sum){

        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        List<Card> cards = mapper.selectBycname(sum);

        sqlSession.close();

        return cards;
    }

    public void add1(Card card){
        SqlSession sqlSession = factory.openSession();

        CardMapper mapper = sqlSession.getMapper(CardMapper.class);

        mapper.add1(card);

        sqlSession.commit();

        sqlSession.close();
    }
}
