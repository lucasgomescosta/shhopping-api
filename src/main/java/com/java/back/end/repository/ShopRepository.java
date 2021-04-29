package com.java.back.end.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.back.end.model.Shop;

/**
 * 
 * @author lucas.costa
 * ReportRepository - Isso serve para que os métodos onde vamos implementar as
 * consultas possam ser injetados sempre que formos utilizar a
 * ShopRepository .
 *
 */
@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>, ReportRepository {

	public List<Shop> findAllByUserIdentifier(String userIdentifier);

	public List<Shop> findAllByTotalGreaterThan(Float total);

	List<Shop> findAllByDateGreaterThan(Date date);
}
