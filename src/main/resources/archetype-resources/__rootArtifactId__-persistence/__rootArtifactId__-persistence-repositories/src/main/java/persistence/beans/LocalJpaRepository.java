#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.beans;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import ${package}.persistence.Entidad;

public interface LocalJpaRepository<T extends Entidad<ID>, ID extends Serializable> extends JpaRepository<T, ID> {

	/**
	 * Retrives an entity reference by its primary key.
	 *
	 * @param id
	 * @return the entity reference with the given primary key or {@code null} if none
	 *         found
	 * @throws IllegalArgumentException if primaryKey is {@code null}
	 */
	T findReference(ID id);

}
