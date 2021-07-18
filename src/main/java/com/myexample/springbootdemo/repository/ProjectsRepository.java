package com.myexample.springbootdemo.repository;

import com.myexample.springbootdemo.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/* Тут конектим JPARepository и обращаемся к базе данных. Помимо уже имеющихся методов можно писать свои любые
 * Так как это Дженерик, то первое значение - это класс к которому мы обращаемся, а второе - тип данных айдишника (Long)
 *  */

public interface ProjectsRepository extends JpaRepository<Projects, Long> {

    @Query(
            value = "select cash from projects where gotovnost = :5)Готово",
            nativeQuery = true
    )
    List<String> findAllCash();

}
