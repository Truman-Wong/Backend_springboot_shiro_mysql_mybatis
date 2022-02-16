package com.example.studentmanagement.mapper;

import com.example.studentmanagement.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    //select* from student from name LIKE %T%;
    @Select("SELECT * from student where name LIKE #{name}")
    List<Student> getStudentsContainStrInName(@Param("name") String name);

    //SELECT* FROM student where university_class_id IN (Select id From university_class where year=2022 and number =1)
    @Select("SELECT* FROM student where university_class_id IN " +
            "(SELECT id From university_class WHERE year = #{year} AND number = #{number})")
    List<Student> getStudentsInClass(@Param("year") int year, @Param("number") int number);

}
