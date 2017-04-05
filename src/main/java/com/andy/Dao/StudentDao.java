package com.andy.Dao;

import com.andy.Entity.Student;

import java.util.Collection;

/**
 * Created by andy on 4/5/17.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
