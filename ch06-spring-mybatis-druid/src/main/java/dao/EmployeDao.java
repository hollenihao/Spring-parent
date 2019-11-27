package dao;

import entity.Employe;
import org.apache.ibatis.annotations.Select;

public interface EmployeDao {

    @Select("select id,username form employe where id=1")
    Employe getById();
}
