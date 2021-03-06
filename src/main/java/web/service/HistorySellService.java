package web.service;

import java.util.List;

import web.entity.HistorySell;

public interface HistorySellService {

	
	void saveHistorySell(HistorySell historySell);
	
	List<HistorySell> findAllHistorySell();
	
	HistorySell findHistorySellById(int id);
	
	List<HistorySell>	findParticularUserHistoryBuy(String userBuy);
}
