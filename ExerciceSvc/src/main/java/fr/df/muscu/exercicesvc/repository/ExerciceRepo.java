package fr.df.muscu.exercicesvc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.df.muscu.exercicesvc.domain.Exercice;
/**
 * Repo Exercecice
 * 
 * @author Florent
 *
 */
@RepositoryRestResource(collectionResourceRel = "exercice", path = "exercice")
public interface ExerciceRepo extends MongoRepository<Exercice, String> {
	
//    Page<Article> findByAuthorsName(String name, Pageable pageable);
// 
//    @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
//    Page<Article> findByAuthorsNameUsingCustomQuery(String name, Pageable pageable);
}