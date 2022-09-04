package com.test.mapper;

import com.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {
    @Select("select * from Student where sid = #{sid}")
    Student findStudentBySid(int sid);
}
