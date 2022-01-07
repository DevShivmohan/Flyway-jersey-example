package com.example.flyway.resources;

import com.example.flyway.entities.Student;
import com.example.flyway.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Slf4j
@Path(value = "/students")
public class StudentResource {

    @Autowired
    private StudentService studentService;

    @GET
    @Path(value = "/show")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        return Response.ok("Hey welcome your future").build();
    }

    @POST
    @Path(value = "/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student){
        log.info("Data is "+student);
        return studentService.addStudent(student);
    }
}
