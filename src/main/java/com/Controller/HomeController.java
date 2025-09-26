package com.Controller;


import com.Entity.User;
import com.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@Slf4j
@Tag(name = "User Actions")
public class HomeController {

    @Autowired
    private UserService us;

    @PostMapping("/register")
    @Operation(summary = "Register Data")
    @ApiResponse(description = "Http Ok status code")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        log.info("User is here :- " + user);

        User u = us.registerUser(user);

        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @GetMapping ("/getuser")
    @Operation(summary = "Fetch Data")
    @ApiResponse(description = "Http Ok status code")
    public ResponseEntity<?> registerUser() {
//        log.info("User is here :- " + user);

        List<User> u = us.getUserInService();

        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @PutMapping("/updateUser/{id}")
    @Operation(summary = "Update Data")
    @ApiResponse(description = "Http Ok status code")
    public ResponseEntity<?> UpdateUser(@RequestBody User user , @PathVariable int id) {
//        log.info("User is here :- " + user);

        User u = us.UpdateUser(user, id);

        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    @Operation(summary = "Delete Data")
    @ApiResponse(description = "Http Ok status code")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
//        log.info("User is here :- " + user);

        us.DeleteUser(id);

        return new ResponseEntity<>("User Deleted", HttpStatus.OK);
    }

}
