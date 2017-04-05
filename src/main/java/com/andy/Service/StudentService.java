package com.andy.Service;

import com.andy.Dao.StudentDao;
import com.andy.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by andy on 4/5/17.
 */

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;


    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);

    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }
}
