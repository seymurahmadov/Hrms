package api.controllers;

import business.abstracts.*;
import entities.concretes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

  private UserService userService;
  private SystemUserService systemUserService;
  private JobSeekersService jobSeekersService;
  private JobPositionsService jobPositionsService;
  private EmployersService employersService;

@Autowired
  public UsersController(UserService userService, SystemUserService systemUserService, JobSeekersService jobSeekersService,
                         JobPositionsService jobPositionsService, EmployersService employersService){
    super();
    this.userService=userService;
    this.systemUserService=systemUserService;
    this.jobSeekersService=jobSeekersService;
    this.jobPositionsService=jobPositionsService;
    this.employersService=employersService;

  }


  @GetMapping("/getalluser")
    public List<User> getAllUser(){
  return  this.userService.getAll();
   }

@GetMapping("/getallsystemuser")
    public  List<SystemUser> getAllSystemUser(){
  return this.systemUserService.getAll();
    }

@GetMapping("/getalljobseekers")
    public List<JobSeekers> getAllJobSeekers(){
  return this.jobSeekersService.getAll();
    }

    @GetMapping("/getalljobpositions")
    public List<JobPositions> getAllJobPositions(){
  return  this.jobPositionsService.getAll();
    }

@GetMapping("/getallemployers")
    public List<Employers> getAllEmployers(){
  return this.employersService.getAll();
    }



}
