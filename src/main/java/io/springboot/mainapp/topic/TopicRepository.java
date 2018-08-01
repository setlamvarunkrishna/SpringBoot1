package io.springboot.mainapp.topic;

import org.springframework.data.repository.CrudRepository;

/*
 * Initially we said we want Topic class to be our class which deals with DB
 * any entity will default perform same task like adding, deleting,updating
 * so by default spring people created a interface which provide those methods we can 
 * extend that interface and by inheritance our code also get those methods
 * that is reason for creating a interface here.
 */
/* Interface which we extended is CurdRepository which have 2 generic
 * 1. we need to enter class for which we have @Entity
* 2. we need to pass the data type of the primary key. 
* we use Topic class and primary key is string
*/

public interface TopicRepository extends CrudRepository<Topic, String> {

}
