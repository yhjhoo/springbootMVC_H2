package me.prince;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


//    public List<Person> findAllByInterestedTopicListContains(String topicName);

    List<Person> findByInterestedTopicListTopicNameIn(List<String> topicName);
}
