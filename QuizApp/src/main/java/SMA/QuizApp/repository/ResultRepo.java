package SMA.QuizApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SMA.QuizApp.model.Result;
@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {

}
