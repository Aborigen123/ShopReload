package web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import web.entity.ActivityOrder;
import web.entity.HistorySell;

@Repository
public interface HistorySellRepository extends JpaRepository<HistorySell, Integer> {
	@Query("SELECT h FROM HistorySell h WHERE h.userBuy = :userBuy")
	List<HistorySell> findParticularUserHistoryBuy(@Param("userBuy") String userBuy);
}
