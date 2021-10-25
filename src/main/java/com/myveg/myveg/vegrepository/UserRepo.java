package com.myveg.myveg.vegrepository;

import com.myveg.myveg.vegmodel.vuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<vuser, Long> {
}
