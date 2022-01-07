package com.example.flyway.services;

import com.example.flyway.dao.StudentDao;
import com.example.flyway.entities.Student;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

@Component
@Slf4j
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Response addStudent(Student student){
        try{
            student=studentDao.save(student);
            if(student!=null)
                return Response.ok(student).build();
            else
                return Response.status(HttpStatus.EXPECTATION_FAILED_417).allow("Due to some technical problem").build();
        }catch (Exception e){
            log.error(e.toString());
            return Response.serverError().status(HttpStatus.INTERNAL_SERVER_ERROR_500).allow(e.toString()).build();
        }
    }
}
