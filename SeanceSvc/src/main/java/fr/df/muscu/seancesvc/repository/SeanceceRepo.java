package fr.df.muscu.seancesvc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.df.muscu.seancesvc.domain.Seance;
/**
 * Repo Seance
 * 
 * @author Florent
 *
 */
@RepositoryRestResource(collectionResourceRel = "exercice", path = "exercice")
public interface SeanceceRepo extends MongoRepository<Seance, String> {
	
//    Page<Article> findByAuthorsName(String name, Pageable pageable);
// 
//    @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
//    Page<Article> findByAuthorsNameUsingCustomQuery(String name, Pageable pageable);
}