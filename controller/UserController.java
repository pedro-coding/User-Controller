package controller;

import model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;


    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @GetMapping("/{id}")  
    public User getUserbyId(@PathVariable Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);

    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setId((nextId++));
        users.add(user);
        return user;
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updateUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                updateUser.setId(id);
                users.set(i, updateUser);
                return ResponseEntity.ok(updateUser);
            }

        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (users.removeIf(user -> user.getId().equals(id))) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
