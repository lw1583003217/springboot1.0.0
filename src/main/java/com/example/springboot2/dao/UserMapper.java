package com.example.springboot2.dao;

import com.example.springboot2.domain.User;
import org.apache.ibatis.annotations.Mapper;
import com.example.springboot2.domain.vedio;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public interface UserMapper {
    @Select("SELECT * FROM demo_user")
    List<User>  selectUser();

    @Select("SELECT * FROM vedio")
    List<vedio> selectVedio();
}



