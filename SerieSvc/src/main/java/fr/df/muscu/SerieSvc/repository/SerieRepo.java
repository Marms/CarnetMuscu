package fr.df.muscu.SerieSvc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.df.muscu.exercicesvc.domain.Serie;
/**
 * Repo Serie 
 * Spring boot essaie de se connecter a l'instance par defaut de mongo (http://localhost:27017/)
 * pour changer ca voir https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-mongodb
 * 
 * @author Florent
 *
 */
@RepositoryRestResource(collectionResourceRel = "serie", path = "serie")
public interface SerieRepo extends MongoRepository<Serie, String> {
	
//    Page<Article> findByAuthorsName(String name, Pageable pageable);
// 
//    @Query("{\"bool\": {\"must\": [{\"match\": {\"authors.name\": \"?0\"}}]}}")
//    Page<Article> findByAuthorsNameUsingCustomQuery(String name, Pageable pageable);
}