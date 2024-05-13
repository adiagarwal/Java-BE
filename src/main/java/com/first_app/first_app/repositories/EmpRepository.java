package com.first_app.first_app.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.first_app.first_app.models.EmpEntity;

@Repository
public interface EmpRepository  extends JpaRepository<EmpEntity,Long>{
    
}
