package com.nectar.prjt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nectar.prjt.Model.FileDB;
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String>{

}
