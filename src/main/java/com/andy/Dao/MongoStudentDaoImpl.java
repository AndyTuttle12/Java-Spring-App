package com.andy.Dao;

import com.andy.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by andy on 4/5/17.
 */
@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

    Connection mongoConnection;
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Mario", "Jumping"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
